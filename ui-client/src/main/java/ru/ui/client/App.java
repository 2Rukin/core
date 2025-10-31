package ru.ui.client;

import atlantafx.base.theme.PrimerDark;
import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ui.client.config.UiClientProperties;
import ru.ui.client.config.UiClientPropertiesLoader;
import ru.ui.client.kafka.MarketEventConsumer;
import ru.ui.client.kafka.RecordDispatcher;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.buffers.TimeSeriesBuffer;
import ru.ui.client.model.buffers.TradeBuffer;
import ru.ui.client.model.clock.VirtualClockLite;
import ru.ui.client.ui.WorkbenchShell;

/**
 * JavaFX entry point that wires together configuration, background ingestion and the
 * WorkbenchFX based desktop shell.
 */
public final class App extends Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  private MarketEventConsumer marketEventConsumer;

  @Override
  public void start(Stage primaryStage) {
    UiClientProperties properties = UiClientPropertiesLoader.load();
    applyTheme(properties);

    EventBus eventBus = new EventBus();
    VirtualClockLite clock = new VirtualClockLite();
    TimeSeriesBuffer timeSeriesBuffer = new TimeSeriesBuffer();
    TradeBuffer tradeBuffer = new TradeBuffer(properties.getUi().getTnsRows());

    WorkbenchShell shell = new WorkbenchShell(
        properties,
        eventBus,
        clock,
        timeSeriesBuffer,
        tradeBuffer
    );

    Scene scene = new Scene(shell, 1280, 768);
    primaryStage.setTitle("Finam Market UI (direct-kafka)");
    primaryStage.setScene(scene);
    primaryStage.show();

    RecordDispatcher dispatcher = new RecordDispatcher(
        properties,
        eventBus,
        timeSeriesBuffer,
        tradeBuffer,
        clock
    );
    marketEventConsumer = new MarketEventConsumer(properties, dispatcher, eventBus);
    marketEventConsumer.start();

    primaryStage.setOnCloseRequest(event -> {
      stop();
      Platform.exit();
    });
  }

  @Override
  public void stop() {
    if (marketEventConsumer != null) {
      try {
        marketEventConsumer.close();
      } catch (Exception e) {
        LOGGER.warn("Error while shutting down consumer", e);
      }
    }
  }

  private void applyTheme(UiClientProperties properties) {
    String theme = properties.getUi().getTheme();
    if ("dark".equalsIgnoreCase(theme)) {
      Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
    } else {
      Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
    }
  }

  /**
   * Launches the JavaFX application.
   *
   * @param args runtime arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
}
