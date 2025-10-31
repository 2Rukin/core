package ru.ui.client.config;

import java.io.InputStream;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

/**
 * Loads {@link UiClientProperties} from {@code ui-client/src/main/resources/application.yml} while
 * applying environment variable and system property overrides.
 */
public final class UiClientPropertiesLoader {

  private static final Logger LOGGER = LoggerFactory.getLogger(UiClientPropertiesLoader.class);

  private UiClientPropertiesLoader() {
  }

  /**
   * Loads configuration from the classpath resource.
   *
   * @return parsed properties
   */
  @SuppressWarnings("unchecked")
  public static UiClientProperties load() {
    try (InputStream inputStream = UiClientPropertiesLoader.class.getResourceAsStream("/application.yml")) {
      if (inputStream == null) {
        throw new IllegalStateException("application.yml not found on classpath");
      }
      Map<String, Object> root = new Yaml().load(inputStream);
      Map<String, Object> uiRoot = (Map<String, Object>) root.getOrDefault("ui", Collections.emptyMap());
      Map<String, Object> kafkaRoot = (Map<String, Object>) uiRoot.getOrDefault(
          "kafka",
          Collections.emptyMap()
      );
      Map<String, Object> topicsRoot = (Map<String, Object>) kafkaRoot.getOrDefault(
          "topics",
          Collections.emptyMap()
      );
      Map<String, Object> symbolsRoot = (Map<String, Object>) uiRoot.getOrDefault(
          "symbols",
          Collections.emptyMap()
      );
      Map<String, Object> uiSettingsRoot = (Map<String, Object>) uiRoot.getOrDefault(
          "ui",
          Collections.emptyMap()
      );

      String bootstrapServers = override(
          "UI_BOOTSTRAP_SERVERS",
          "ui.bootstrapServers",
          readString(kafkaRoot, "bootstrapServers", "localhost:19092")
      );
      String groupId = override(
          "UI_GROUP_ID",
          "ui.groupId",
          readString(kafkaRoot, "groupId", "ui-local-dev")
      );
      String schemaRegistryUrl = override(
          "UI_SCHEMA_REGISTRY_URL",
          "ui.schemaRegistryUrl",
          readString(kafkaRoot, "schemaRegistryUrl", "http://localhost:8082")
      );
      String autoOffsetReset = override(
          "UI_AUTO_OFFSET_RESET",
          "ui.autoOffsetReset",
          readString(kafkaRoot, "autoOffsetReset", "latest")
      );
      Duration reconnectBackoff = Duration.ofMillis(
          Long.parseLong(override(
              "UI_RECONNECT_BACKOFF_MS",
              "ui.reconnectBackoffMs",
              Long.toString(readLong(kafkaRoot, "reconnectBackoffMs", 2000L))
          ))
      );

      String barsTopic = override(
          "UI_TOPIC_BARS",
          "ui.topic.bars",
          readString(topicsRoot, "bars", "finam.md.bars.v1")
      );
      String tradesTopic = override(
          "UI_TOPIC_TRADES",
          "ui.topic.trades",
          readString(topicsRoot, "trades", "finam.md.trades.v1")
      );
      String quotesTopic = override(
          "UI_TOPIC_QUOTES",
          "ui.topic.quotes",
          readString(topicsRoot, "quotes", "finam.md.quotes.v1")
      );
      String orderBookTopic = override(
          "UI_TOPIC_ORDERBOOK",
          "ui.topic.orderbook",
          readString(topicsRoot, "orderbook", "finam.md.orderbook.v1")
      );
      String cloudsTopic = override(
          "UI_TOPIC_CLOUDS",
          "ui.topic.clouds",
          readString(topicsRoot, "clouds", "finam.features.clouds.v1")
      );

      List<String> includeSymbols = parseIncludeSymbols(
          override(
              "UI_SYMBOLS_INCLUDE",
              "ui.symbols.include",
              joinList(readList(symbolsRoot, "include"))
          )
      );

      String theme = override(
          "UI_THEME",
          "ui.theme",
          readString(uiSettingsRoot, "theme", "dark")
      );
      int tnsRows = Integer.parseInt(override(
          "UI_TNS_ROWS",
          "ui.tnsRows",
          Integer.toString(readInt(uiSettingsRoot, "tnsRows", 1000))
      ));

      UiClientProperties.TopicsProperties topics = new UiClientProperties.TopicsProperties(
          barsTopic,
          tradesTopic,
          quotesTopic,
          orderBookTopic,
          cloudsTopic
      );
      UiClientProperties.KafkaProperties kafka = new UiClientProperties.KafkaProperties(
          bootstrapServers,
          groupId,
          schemaRegistryUrl,
          autoOffsetReset,
          reconnectBackoff,
          topics
      );
      UiClientProperties.SymbolsProperties symbols = new UiClientProperties.SymbolsProperties(includeSymbols);
      UiClientProperties.UiSettings uiSettings = new UiClientProperties.UiSettings(theme, tnsRows);
      return new UiClientProperties(kafka, symbols, uiSettings);
    } catch (Exception ex) {
      LOGGER.error("Failed to load UI configuration", ex);
      throw new IllegalStateException("Unable to load UI configuration", ex);
    }
  }

  private static String readString(Map<String, Object> root, String key, String defaultValue) {
    Object value = root.get(key);
    return value != null ? String.valueOf(value) : defaultValue;
  }

  private static long readLong(Map<String, Object> root, String key, long defaultValue) {
    Object value = root.get(key);
    if (value == null) {
      return defaultValue;
    }
    if (value instanceof Number number) {
      return number.longValue();
    }
    return Long.parseLong(value.toString());
  }

  private static int readInt(Map<String, Object> root, String key, int defaultValue) {
    Object value = root.get(key);
    if (value == null) {
      return defaultValue;
    }
    if (value instanceof Number number) {
      return number.intValue();
    }
    return Integer.parseInt(value.toString());
  }

  private static List<String> readList(Map<String, Object> root, String key) {
    Object value = root.get(key);
    if (value instanceof List<?> list) {
      return list.stream().map(Object::toString).toList();
    }
    return List.of();
  }

  private static String joinList(List<String> values) {
    return String.join(",", values);
  }

  private static List<String> parseIncludeSymbols(String value) {
    if (value == null || value.isBlank()) {
      return List.of();
    }
    return Stream.of(value.split(","))
        .map(String::trim)
        .filter(token -> !token.isEmpty())
        .map(token -> token.toUpperCase(Locale.ROOT))
        .toList();
  }

  private static String override(String envName, String sysProp, String fallback) {
    return Optional.ofNullable(System.getProperty(sysProp))
        .filter(str -> !str.isBlank())
        .or(() -> Optional.ofNullable(System.getenv(envName)))
        .filter(str -> !str.isBlank())
        .orElse(fallback);
  }
}
