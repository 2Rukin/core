package ru.ui.client.kafka;

import java.util.Map;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import ru.domain.market.proto.MarketEvent;

/**
 * Lightweight protobuf deserializer for {@link MarketEvent} payloads compatible with the
 * Confluent Schema Registry framing.
 */
public final class MarketEventDeserializer implements Deserializer<MarketEvent> {

  private static final int CONFLUENT_MAGIC_BYTE = 0;
  private static final int SCHEMA_ID_SIZE = 4;

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    // No-op
  }

  @Override
  public MarketEvent deserialize(String topic, byte[] data) {
    if (data == null || data.length == 0) {
      return null;
    }
    try {
      int offset = 0;
      if (isConfluentFramed(data)) {
        if (data.length <= 1 + SCHEMA_ID_SIZE) {
          throw new SerializationException("Confluent framing header is incomplete");
        }
        offset = 1 + SCHEMA_ID_SIZE;
        VarIntResult messageIndexLength = readVarInt(data, offset);
        offset = messageIndexLength.position();
        for (int i = 0; i < messageIndexLength.value(); i++) {
          offset = readVarInt(data, offset).position();
        }
      }
      return MarketEvent.parser().parseFrom(data, offset, data.length - offset);
    } catch (Exception ex) {
      throw new SerializationException("Failed to deserialize MarketEvent", ex);
    }
  }

  @Override
  public void close() {
    // No-op
  }

  private boolean isConfluentFramed(byte[] data) {
    return data.length > 1 && data[0] == CONFLUENT_MAGIC_BYTE;
  }

  private VarIntResult readVarInt(byte[] data, int offset) {
    int value = 0;
    int shift = 0;
    int position = offset;
    while (position < data.length) {
      int current = data[position++] & 0xFF;
      value |= (current & 0x7F) << shift;
      if ((current & 0x80) == 0) {
        return new VarIntResult(value, position);
      }
      shift += 7;
      if (shift > 28) {
        throw new SerializationException("Varint too long in Confluent framing");
      }
    }
    throw new SerializationException("Unexpected end of data while reading Confluent framing");
  }

  private record VarIntResult(int value, int position) {
  }
}
