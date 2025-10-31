package ru.ui.client.config;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Immutable configuration bean that exposes all UI specific settings under the {@code ui.*}
 * namespace.
 */
public final class UiClientProperties {

  private final KafkaProperties kafka;
  private final SymbolsProperties symbols;
  private final UiSettings ui;

  /**
   * Creates a new instance.
   *
   * @param kafka kafka related configuration
   * @param symbols symbol filtering rules
   * @param ui UI specific settings
   */
  public UiClientProperties(KafkaProperties kafka, SymbolsProperties symbols, UiSettings ui) {
    this.kafka = Objects.requireNonNull(kafka, "kafka");
    this.symbols = Objects.requireNonNull(symbols, "symbols");
    this.ui = Objects.requireNonNull(ui, "ui");
  }

  /**
   * Returns Kafka connectivity properties.
   *
   * @return configuration with bootstrap servers and topic names
   */
  public KafkaProperties getKafka() {
    return kafka;
  }

  /**
   * Returns symbol filtering configuration.
   *
   * @return symbol configuration
   */
  public SymbolsProperties getSymbols() {
    return symbols;
  }

  /**
   * Returns UI specific options such as theme and buffer sizes.
   *
   * @return UI settings
   */
  public UiSettings getUi() {
    return ui;
  }

  /**
   * Kafka connectivity and topic configuration.
   */
  public static final class KafkaProperties {

    private final String bootstrapServers;
    private final String groupId;
    private final String schemaRegistryUrl;
    private final String autoOffsetReset;
    private final Duration reconnectBackoff;
    private final TopicsProperties topics;

    /**
     * Creates a new instance.
     *
     * @param bootstrapServers bootstrap servers list
     * @param groupId consumer group id
     * @param schemaRegistryUrl schema registry endpoint
     * @param autoOffsetReset policy for {@code auto.offset.reset}
     * @param reconnectBackoff reconnect backoff used by the consumer
     * @param topics topic names mapping
     */
    public KafkaProperties(
        String bootstrapServers,
        String groupId,
        String schemaRegistryUrl,
        String autoOffsetReset,
        Duration reconnectBackoff,
        TopicsProperties topics
    ) {
      this.bootstrapServers = Objects.requireNonNull(bootstrapServers, "bootstrapServers");
      this.groupId = Objects.requireNonNull(groupId, "groupId");
      this.schemaRegistryUrl = Objects.requireNonNull(schemaRegistryUrl, "schemaRegistryUrl");
      this.autoOffsetReset = Objects.requireNonNull(autoOffsetReset, "autoOffsetReset");
      this.reconnectBackoff = Objects.requireNonNull(reconnectBackoff, "reconnectBackoff");
      this.topics = Objects.requireNonNull(topics, "topics");
    }

    /**
     * Kafka bootstrap servers.
     *
     * @return bootstrap servers string
     */
    public String getBootstrapServers() {
      return bootstrapServers;
    }

    /**
     * Consumer group id used by UI modules.
     *
     * @return group id
     */
    public String getGroupId() {
      return groupId;
    }

    /**
     * Schema registry URL.
     *
     * @return schema registry URL
     */
    public String getSchemaRegistryUrl() {
      return schemaRegistryUrl;
    }

    /**
     * Value for {@code auto.offset.reset}.
     *
     * @return reset policy
     */
    public String getAutoOffsetReset() {
      return autoOffsetReset;
    }

    /**
     * Reconnect backoff for the consumer loop.
     *
     * @return reconnect backoff duration
     */
    public Duration getReconnectBackoff() {
      return reconnectBackoff;
    }

    /**
     * Topic names mapping.
     *
     * @return topic configuration
     */
    public TopicsProperties getTopics() {
      return topics;
    }
  }

  /**
   * Topic names the UI subscribes to.
   */
  public static final class TopicsProperties {

    private final String bars;
    private final String trades;
    private final String quotes;
    private final String orderbook;
    private final String clouds;

    /**
     * Creates a new instance.
     *
     * @param bars bars topic
     * @param trades trades topic
     * @param quotes quotes topic
     * @param orderbook order book topic
     * @param clouds clouds topic
     */
    public TopicsProperties(
        String bars,
        String trades,
        String quotes,
        String orderbook,
        String clouds
    ) {
      this.bars = Objects.requireNonNull(bars, "bars");
      this.trades = Objects.requireNonNull(trades, "trades");
      this.quotes = Objects.requireNonNull(quotes, "quotes");
      this.orderbook = Objects.requireNonNull(orderbook, "orderbook");
      this.clouds = Objects.requireNonNull(clouds, "clouds");
    }

    /**
     * Returns the topic name for bars stream.
     *
     * @return bars topic name
     */
    public String getBars() {
      return bars;
    }

    /**
     * Returns the topic name for trades stream.
     *
     * @return trades topic name
     */
    public String getTrades() {
      return trades;
    }

    /**
     * Returns the topic name for quotes stream.
     *
     * @return quotes topic name
     */
    public String getQuotes() {
      return quotes;
    }

    /**
     * Returns the topic name for order book stream.
     *
     * @return order book topic name
     */
    public String getOrderbook() {
      return orderbook;
    }

    /**
     * Returns the topic name for clouds stream.
     *
     * @return clouds topic name
     */
    public String getClouds() {
      return clouds;
    }
  }

  /**
   * Symbol filtering configuration.
   */
  public static final class SymbolsProperties {

    private final List<String> include;

    /**
     * Creates a new instance.
     *
     * @param include list of allowed symbols
     */
    public SymbolsProperties(List<String> include) {
      Objects.requireNonNull(include, "include");
      this.include = Collections.unmodifiableList(new ArrayList<>(include));
    }

    /**
     * List of explicitly allowed symbols. Empty list means "all".
     *
     * @return immutable list of symbols
     */
    public List<String> getInclude() {
      return include;
    }
  }

  /**
   * UI specific settings.
   */
  public static final class UiSettings {

    private final String theme;
    private final int tnsRows;

    /**
     * Creates a new instance.
     *
     * @param theme theme identifier
     * @param tnsRows maximum rows allowed in Time &amp; Sales view
     */
    public UiSettings(String theme, int tnsRows) {
      this.theme = Objects.requireNonNull(theme, "theme");
      if (tnsRows <= 0) {
        throw new IllegalArgumentException("tnsRows must be positive");
      }
      this.tnsRows = tnsRows;
    }

    /**
     * Name of the requested UI theme (dark/light).
     *
     * @return theme string
     */
    public String getTheme() {
      return theme;
    }

    /**
     * Maximum number of rows displayed in the Time &amp; Sales module.
     *
     * @return maximum row count
     */
    public int getTnsRows() {
      return tnsRows;
    }
  }
}
