package ru.ui.client.ui.tns;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import org.fxmisc.flowless.Cell;
import org.fxmisc.flowless.VirtualFlow;
import org.kordamp.ikonli.materialdesign2.MaterialDesignS;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.buffers.TradeBuffer;
import ru.ui.client.model.events.SymbolFilterChangedEvent;
import ru.ui.client.model.events.TradeUpdateEvent;
import com.dlsc.workbenchfx.model.WorkbenchModule;

/**
 * Workbench module that renders a virtualized Time &amp; Sales table.
 */
public final class TimeAndSalesModule extends WorkbenchModule {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter
      .ofPattern("HH:mm:ss.SSS")
      .withZone(ZoneId.systemDefault());

  private final EventBus eventBus;
  private final TradeBuffer tradeBuffer;
  private final ObservableList<TradeUpdateEvent> items = FXCollections.observableArrayList();
  private final VirtualFlow<TradeUpdateEvent, Cell<TradeUpdateEvent, ?>> flow =
      VirtualFlow.createVertical(items, item -> Cell.wrapNode(createRow(item)));
  private final BorderPane root = new BorderPane();
  private final Label header = new Label("Time & Sales");
  private final AtomicReference<Optional<String>> activeSymbol = new AtomicReference<>(Optional.empty());

  /**
   * Creates a new Time &amp; Sales module instance.
   *
   * @param eventBus event bus providing trade events
   * @param tradeBuffer shared trade buffer
   */
  public TimeAndSalesModule(EventBus eventBus, TradeBuffer tradeBuffer) {
    super("Time & Sales", MaterialDesignS.SWAP_VERTICAL);
    this.eventBus = Objects.requireNonNull(eventBus, "eventBus");
    this.tradeBuffer = Objects.requireNonNull(tradeBuffer, "tradeBuffer");
    flow.setPadding(new Insets(4));
    root.setTop(header);
    BorderPane.setMargin(header, new Insets(12, 12, 0, 12));
    root.setCenter(flow);

    eventBus.subscribe(TradeUpdateEvent.class, this::handleTrade); 
    eventBus.subscribe(SymbolFilterChangedEvent.class, event -> {
      activeSymbol.set(event.symbol());
      refresh();
    });
  }

  private void handleTrade(TradeUpdateEvent event) {
    activeSymbol.updateAndGet(current -> current.or(() -> Optional.of(event.symbol())));
    refresh();
  }

  private void refresh() {
    Platform.runLater(() -> {
      Optional<String> symbol = activeSymbol.get();
      if (symbol.isEmpty() && !tradeBuffer.symbols().isEmpty()) {
        symbol = Optional.of(tradeBuffer.symbols().get(0));
        activeSymbol.set(symbol);
      }
      List<TradeUpdateEvent> snapshot = symbol.map(tradeBuffer::snapshot).orElse(List.of());
      items.setAll(snapshot);
      header.setText(symbol.map(value -> "Time & Sales — " + value).orElse("Time & Sales"));
      if (!snapshot.isEmpty()) {
        flow.show(0);
      }
    });
  }

  private Node createRow(TradeUpdateEvent event) {
    Label ts = new Label(FORMATTER.format(event.eventTime()));
    ts.setPrefWidth(120);
    Label price = new Label(event.price().toPlainString());
    price.setPrefWidth(120);
    Label size = new Label(event.quantity().toPlainString());
    size.setPrefWidth(100);
    Label side = new Label(event.side().name());
    side.setPrefWidth(90);
    if ("AGGRESSOR_SIDE_BUY".equals(event.side().name())) {
      price.setTextFill(Color.LIMEGREEN);
    } else if ("AGGRESSOR_SIDE_SELL".equals(event.side().name())) {
      price.setTextFill(Color.SALMON);
    }
    HBox row = new HBox(ts, price, size, side);
    row.setSpacing(12);
    row.setPadding(new Insets(4));
    return row;
  }

  @Override
  public Node activate() {
    return root;
  }
}
