package ru.ui.client.kafka;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.domain.market.proto.MarketEvent;
import ru.ui.client.config.UiClientProperties;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.events.ConnectionStateEvent;
import ru.ui.client.model.events.ConnectionStateEvent.State;

/**
 * Kafka consumer dedicated to market data topics.
 */
public final class MarketEventConsumer implements AutoCloseable {

  private static final Logger LOGGER = LoggerFactory.getLogger(MarketEventConsumer.class);

  private final UiClientProperties properties;
  private final RecordDispatcher dispatcher;
  private final EventBus eventBus;
  private final ExecutorService executor = Executors.newSingleThreadExecutor(r -> {
    Thread thread = new Thread(r, "market-event-consumer");
    thread.setDaemon(true);
    return thread;
  });
  private final AtomicBoolean running = new AtomicBoolean();
  private final AtomicBoolean connected = new AtomicBoolean();

  private KafkaConsumer<String, MarketEvent> consumer;

  /**
   * Creates a new consumer instance.
   *
   * @param properties client configuration
   * @param dispatcher record dispatcher
   * @param eventBus event bus used to publish status updates
   */
  public MarketEventConsumer(
      UiClientProperties properties,
      RecordDispatcher dispatcher,
      EventBus eventBus
  ) {
    this.properties = Objects.requireNonNull(properties, "properties");
    this.dispatcher = Objects.requireNonNull(dispatcher, "dispatcher");
    this.eventBus = Objects.requireNonNull(eventBus, "eventBus");
  }

  /**
   * Starts the background consumption loop.
   */
  public void start() {
    if (running.compareAndSet(false, true)) {
      eventBus.publish(new ConnectionStateEvent(State.CONNECTING, "Connecting", Instant.now()));
      executor.submit(this::runConsumerLoop);
    }
  }

  private void runConsumerLoop() {
    while (running.get()) {
      try {
        ensureConsumer();
        markConnected();
        ConsumerRecords<String, MarketEvent> records = consumer.poll(Duration.ofSeconds(1));
        records.forEach(dispatcher::dispatch);
      } catch (WakeupException wakeupException) {
        LOGGER.debug("Consumer wakeup requested");
      } catch (Exception ex) {
        markDisconnected(ex.getMessage());
        LOGGER.warn("Kafka consumer failure", ex);
        closeConsumer();
        sleepBackoff();
      }
    }
    closeConsumer();
  }

  private void ensureConsumer() {
    if (consumer != null) {
      return;
    }
    Properties props = new Properties();
    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getKafka().getBootstrapServers());
    props.put(ConsumerConfig.GROUP_ID_CONFIG, properties.getKafka().getGroupId());
    props.put(ConsumerConfig.CLIENT_ID_CONFIG, "ui-client-" + UUID.randomUUID());
    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, MarketEventDeserializer.class.getName());
    props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, properties.getKafka().getAutoOffsetReset());
    consumer = new KafkaConsumer<>(props);
    UiClientProperties.TopicsProperties topics = properties.getKafka().getTopics();
    List<String> topicNames = Stream.of(
            topics.getBars(),
            topics.getTrades(),
            topics.getQuotes(),
            topics.getOrderbook(),
            topics.getClouds()
        )
        .filter(Objects::nonNull)
        .map(String::trim)
        .filter(name -> !name.isEmpty())
        .distinct()
        .toList();
    if (topicNames.isEmpty()) {
      throw new IllegalStateException("No Kafka topics configured for UI client");
    }
    LOGGER.info("Subscribing to topics {}", topicNames);
    consumer.subscribe(topicNames);
  }

  private void markConnected() {
    if (connected.compareAndSet(false, true)) {
      eventBus.publish(new ConnectionStateEvent(State.CONNECTED, "Connected", Instant.now()));
    }
  }

  private void markDisconnected(String reason) {
    if (connected.getAndSet(false)) {
      String message = reason == null ? "Disconnected" : "Disconnected: " + reason;
      eventBus.publish(new ConnectionStateEvent(State.DISCONNECTED, message, Instant.now()));
    }
  }

  private void closeConsumer() {
    if (consumer != null) {
      try {
        consumer.close();
      } catch (Exception closeError) {
        LOGGER.debug("Error while closing Kafka consumer", closeError);
      }
      consumer = null;
    }
  }

  private void sleepBackoff() {
    try {
      Thread.sleep(properties.getKafka().getReconnectBackoff().toMillis());
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
    }
  }

  @Override
  public void close() {
    running.set(false);
    if (consumer != null) {
      consumer.wakeup();
    }
    executor.shutdownNow();
    try {
      if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
        LOGGER.warn("Consumer thread did not terminate cleanly");
      }
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    closeConsumer();
  }
}
