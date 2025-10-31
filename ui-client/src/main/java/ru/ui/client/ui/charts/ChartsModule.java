package ru.ui.client.ui.charts;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import org.kordamp.ikonli.materialdesign2.MaterialDesignT;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.buffers.TimeSeriesBuffer;
import ru.ui.client.model.buffers.TimeSeriesBuffer.BarSample;
import ru.ui.client.model.events.BarUpdateEvent;
import ru.ui.client.model.events.SymbolFilterChangedEvent;
import com.dlsc.workbenchfx.model.WorkbenchModule;

/**
 * Workbench module that renders close price and volume series using a canvas.
 */
public final class ChartsModule extends WorkbenchModule {

  private final EventBus eventBus;
  private final TimeSeriesBuffer buffer;
  private final Canvas priceCanvas = new Canvas(900, 420);
  private final Canvas volumeCanvas = new Canvas(900, 180);
  private final Label header = new Label("Symbol: --");
  private final BorderPane root = new BorderPane();
  private final AtomicReference<Optional<String>> activeSymbol = new AtomicReference<>(Optional.empty());

  /**
   * Creates a new charts module instance.
   *
   * @param eventBus event bus providing bar events
   * @param buffer shared time series buffer
   */
  public ChartsModule(EventBus eventBus, TimeSeriesBuffer buffer) {
    super("Charts", MaterialDesignT.TRENDING_UP);
    this.eventBus = Objects.requireNonNull(eventBus, "eventBus");
    this.buffer = Objects.requireNonNull(buffer, "buffer");
    VBox charts = new VBox(priceCanvas, volumeCanvas);
    charts.setSpacing(8);
    charts.setPadding(new Insets(8));
    root.setTop(header);
    BorderPane.setMargin(header, new Insets(12, 12, 0, 12));
    root.setCenter(charts);

    priceCanvas.widthProperty().addListener((obs, oldValue, newValue) -> render());
    priceCanvas.heightProperty().addListener((obs, oldValue, newValue) -> render());
    volumeCanvas.widthProperty().addListener((obs, oldValue, newValue) -> render());
    volumeCanvas.heightProperty().addListener((obs, oldValue, newValue) -> render());

    eventBus.subscribe(BarUpdateEvent.class, this::handleBarUpdate);
    eventBus.subscribe(SymbolFilterChangedEvent.class, event -> {
      activeSymbol.set(event.symbol());
      render();
    });
  }

  private void handleBarUpdate(BarUpdateEvent event) {
    activeSymbol.updateAndGet(current -> current.or(() -> Optional.of(event.symbol())));
    render();
  }

  private void render() {
    Platform.runLater(() -> {
      Optional<String> symbol = activeSymbol.get();
      if (symbol.isEmpty() && !buffer.symbols().isEmpty()) {
        symbol = Optional.of(buffer.symbols().get(0));
        activeSymbol.set(symbol);
      }
      List<BarSample> samples = symbol.map(buffer::snapshot).orElse(List.of());
      drawPrice(samples);
      drawVolume(samples);
      header.setText(symbol.map(value -> "Symbol: " + value + " (bars=" + samples.size() + ")").orElse("Symbol: --"));
    });
  }

  private void drawPrice(List<BarSample> samples) {
    GraphicsContext context = priceCanvas.getGraphicsContext2D();
    double width = priceCanvas.getWidth();
    double height = priceCanvas.getHeight();
    context.setFill(Color.web("#1e1e1e"));
    context.fillRect(0, 0, width, height);
    context.setStroke(Color.web("#4fc3f7"));
    context.setLineWidth(1.5);

    if (samples.isEmpty()) {
      context.setFill(Color.GRAY);
      context.fillText("No bar data", width / 2 - 40, height / 2);
      return;
    }

    double minPrice = samples.stream().mapToDouble(sample -> toDouble(sample.low())).min().orElse(0d);
    double maxPrice = samples.stream().mapToDouble(sample -> toDouble(sample.high())).max().orElse(1d);
    double range = Math.max(1e-6, maxPrice - minPrice);
    double xStep = width / Math.max(1, samples.size() - 1);

    context.beginPath();
    for (int i = 0; i < samples.size(); i++) {
      double x = i * xStep;
      double close = toDouble(samples.get(i).close());
      double y = height - ((close - minPrice) / range) * (height - 20) - 10;
      if (i == 0) {
        context.moveTo(x, y);
      } else {
        context.lineTo(x, y);
      }
    }
    context.stroke();
  }

  private void drawVolume(List<BarSample> samples) {
    GraphicsContext context = volumeCanvas.getGraphicsContext2D();
    double width = volumeCanvas.getWidth();
    double height = volumeCanvas.getHeight();
    context.setFill(Color.web("#1b1b1b"));
    context.fillRect(0, 0, width, height);

    if (samples.isEmpty()) {
      context.setFill(Color.GRAY);
      context.fillText("No volume data", width / 2 - 40, height / 2);
      return;
    }

    double maxVolume = samples.stream().mapToDouble(sample -> toDouble(sample.volume())).max().orElse(1d);
    double xStep = width / Math.max(1, samples.size());

    for (int i = 0; i < samples.size(); i++) {
      double x = i * xStep;
      double volume = toDouble(samples.get(i).volume());
      double barHeight = (volume / maxVolume) * (height - 10);
      context.setFill(Color.web("#81c784"));
      context.fillRect(x, height - barHeight, Math.max(2, xStep - 2), barHeight);
    }
  }

  private double toDouble(BigDecimal value) {
    return value == null ? 0d : value.doubleValue();
  }

  @Override
  public Node activate() {
    return root;
  }
}
