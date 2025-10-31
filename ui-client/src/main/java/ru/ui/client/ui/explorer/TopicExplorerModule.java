package ru.ui.client.ui.explorer;

import com.dlsc.workbenchfx.model.WorkbenchModule;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.kordamp.ikonli.materialdesign2.MaterialDesignT;
import ru.domain.market.proto.MarketEvent;
import ru.ui.client.config.UiClientProperties;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.events.SymbolFilterChangedEvent;
import ru.ui.client.model.events.TopicRecordEvent;
import ru.ui.client.util.Keys;

/**
 * Topic Explorer module that visualises raw Kafka records with filtering controls.
 */
public final class TopicExplorerModule extends WorkbenchModule {

  private static final DateTimeFormatter TIMESTAMP_FORMAT = DateTimeFormatter
      .ofPattern("yyyy-MM-dd HH:mm:ss")
      .withZone(ZoneId.systemDefault());
  private static final int MAX_RECORDS = 5000;

  private final EventBus eventBus;
  private final TableView<TopicRecordView> tableView = new TableView<>();
  private final ObservableList<TopicRecordView> records = FXCollections.observableArrayList();
  private final FilteredList<TopicRecordView> filteredRecords = new FilteredList<>(records);
  private final ObservableList<String> symbolOptions = FXCollections.observableArrayList();
  private final ChoiceBox<String> typeFilter = new ChoiceBox<>();
  private final ChoiceBox<String> symbolFilter = new ChoiceBox<>();
  private final BooleanProperty paused = new SimpleBooleanProperty(false);
  private final AtomicReference<String> selectedType = new AtomicReference<>("ALL");
  private final AtomicReference<Optional<String>> selectedSymbol = new AtomicReference<>(Optional.empty());
  private final BorderPane content;

  /**
   * Creates a new Topic Explorer module instance.
   *
   * @param eventBus application event bus
   * @param properties UI client configuration
   */
  public TopicExplorerModule(EventBus eventBus, UiClientProperties properties) {
    super("Topic Explorer", MaterialDesignT.TABLE);
    this.eventBus = Objects.requireNonNull(eventBus, "eventBus");
    Objects.requireNonNull(properties, "properties");

    configureTable();
    configureSymbolFilter(properties);

    ToggleButton pauseButton = new ToggleButton("Pause");
    pauseButton.selectedProperty().bindBidirectional(paused);
    paused.addListener((obs, oldValue, newValue) -> pauseButton.setText(newValue ? "Resume" : "Pause"));

    typeFilter.setItems(FXCollections.observableArrayList(
        "ALL", "BAR", "TRADE", "QUOTE", "ORDER_BOOK", "EXECUTION", "PORTFOLIO", "KEEPALIVE", "ERROR", "ORDER"
    ));
    typeFilter.getSelectionModel().selectFirst();
    typeFilter.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
      selectedType.set(newValue);
      updatePredicate();
    });

    symbolFilter.setItems(symbolOptions);
    symbolFilter.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
      Optional<String> selection = Optional.ofNullable(newValue).filter(value -> !value.isBlank());
      selectedSymbol.set(selection);
      eventBus.publish(new SymbolFilterChangedEvent(selection));
      updatePredicate();
    });

    HBox toolbar = new HBox(12,
        new Label("Event type:"), typeFilter,
        new Label("Symbol:"), symbolFilter,
        pauseButton
    );
    toolbar.setPadding(new Insets(0, 0, 12, 0));

    content = new BorderPane();
    content.setPadding(new Insets(8));
    content.setTop(toolbar);
    content.setCenter(tableView);

    eventBus.subscribe(TopicRecordEvent.class, this::handleRecord);
  }

  // ControlsFX table relies on reflection-based PropertyValueFactory which triggers unchecked warnings.
  @SuppressWarnings("unchecked")
  private void configureTable() {
    tableView.setItems(filteredRecords);
    TableColumn<TopicRecordView, String> typeColumn = new TableColumn<>("Type");
    typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
    typeColumn.setPrefWidth(140);

    TableColumn<TopicRecordView, String> keyColumn = new TableColumn<>("Key");
    keyColumn.setCellValueFactory(new PropertyValueFactory<>("key"));
    keyColumn.setPrefWidth(220);

    TableColumn<TopicRecordView, String> summaryColumn = new TableColumn<>("Summary");
    summaryColumn.setCellValueFactory(new PropertyValueFactory<>("summary"));
    summaryColumn.setPrefWidth(520);

    TableColumn<TopicRecordView, String> timeColumn = new TableColumn<>("Event time");
    timeColumn.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
    timeColumn.setPrefWidth(200);

    tableView.getColumns().addAll(typeColumn, keyColumn, summaryColumn, timeColumn);
    tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);
    tableView.setPlaceholder(new Label("Waiting for messages"));
  }

  private void configureSymbolFilter(UiClientProperties properties) {
    Set<String> configuredSymbols = new HashSet<>(properties.getSymbols().getInclude());
    if (!configuredSymbols.isEmpty()) {
      configuredSymbols.stream().sorted().forEach(symbolOptions::add);
    }
    symbolFilter.getItems().add(0, "");
    symbolFilter.getSelectionModel().selectFirst();
  }

  private void handleRecord(TopicRecordEvent event) {
    if (paused.get()) {
      return;
    }
    Platform.runLater(() -> {
      TopicRecordView view = new TopicRecordView(event);
      records.add(0, view);
      if (records.size() > MAX_RECORDS) {
        records.remove(records.size() - 1);
      }
      updateSymbolOptions(view.symbol());
      updatePredicate();
    });
  }

  private void updateSymbolOptions(String symbol) {
    if (symbol == null || symbol.isBlank()) {
      return;
    }
    if (!symbolOptions.contains(symbol)) {
      symbolOptions.add(symbol);
      symbolOptions.sort(Comparator.naturalOrder());
    }
  }

  private void updatePredicate() {
    filteredRecords.setPredicate(view -> {
      boolean typeMatches = "ALL".equals(selectedType.get()) || view.getType().equals(selectedType.get());
      boolean symbolMatches = selectedSymbol.get().map(symbol -> symbol.equals(view.symbol())).orElse(true);
      return typeMatches && symbolMatches;
    });
  }

  @Override
  public Node activate() {
    return content;
  }

  /**
   * View model used by the table.
   */
  public static final class TopicRecordView {

    private final String type;
    private final String key;
    private final String summary;
    private final String eventTime;
    private final String symbol;

    TopicRecordView(TopicRecordEvent event) {
      this.key = event.key();
      this.symbol = Keys.parse(event.key()).map(Keys.SymbolKey::code)
          .filter(code -> !code.isBlank())
          .orElseGet(() -> event.event().getEnv().getCode());
      this.type = event.event().getPayloadCase().name();
      this.summary = buildSummary(event.event());
      Instant ts = event.event().getEnv().hasEventTs()
          ? Instant.ofEpochSecond(
              event.event().getEnv().getEventTs().getSeconds(),
              event.event().getEnv().getEventTs().getNanos()
          )
          : event.receivedAt();
      this.eventTime = TIMESTAMP_FORMAT.format(ts);
    }

    private String buildSummary(MarketEvent event) {
      return switch (event.getPayloadCase()) {
        case BAR -> "Close=" + event.getBar().getClose().getValue() + " Vol=" + event.getBar().getVolume().getValue();
        case TRADE -> "Trade price=" + event.getTrade().getPrice().getValue()
            + " qty=" + event.getTrade().getQuantity().getValue();
        case QUOTE -> "Bid=" + event.getQuote().getBid().getValue()
            + " / Ask=" + event.getQuote().getAsk().getValue();
        case ORDER_BOOK -> "Bids=" + event.getOrderBook().getBidsCount()
            + " Asks=" + event.getOrderBook().getAsksCount();
        case EXECUTION -> "Execution=" + event.getExecution().getExecutionId();
        case PORTFOLIO -> "Account=" + event.getPortfolio().getAccountId();
        case KEEPALIVE -> "Keepalive token=" + event.getKeepalive().getToken();
        case ERROR -> "Error=" + event.getError().getCode();
        case ORDER -> "Order=" + event.getOrder().getOrderId();
        case PAYLOAD_NOT_SET -> "Unknown payload";
      };
    }

    /**
     * Returns the market event type.
     *
     * @return event type
     */
    public String getType() {
      return type;
    }

    /**
     * Returns the Kafka record key.
     *
     * @return record key
     */
    public String getKey() {
      return key;
    }

    /**
     * Returns human friendly summary.
     *
     * @return payload summary
     */
    public String getSummary() {
      return summary;
    }

    /**
     * Returns formatted event timestamp.
     *
     * @return event time string
     */
    public String getEventTime() {
      return eventTime;
    }

    /**
     * Returns symbol associated with the record.
     *
     * @return symbol value
     */
    public String symbol() {
      return symbol;
    }
  }
}
