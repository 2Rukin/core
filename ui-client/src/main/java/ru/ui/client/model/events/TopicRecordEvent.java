package ru.ui.client.model.events;

import java.time.Instant;
import java.util.Objects;
import ru.domain.market.proto.MarketEvent;

/**
 * Raw record received from Kafka used by the Topic Explorer module.
 */
public record TopicRecordEvent(
    String topic,
    String key,
    MarketEvent event,
    Instant receivedAt
) {

  public TopicRecordEvent {
    Objects.requireNonNull(topic, "topic");
    Objects.requireNonNull(key, "key");
    Objects.requireNonNull(event, "event");
    Objects.requireNonNull(receivedAt, "receivedAt");
  }
}
