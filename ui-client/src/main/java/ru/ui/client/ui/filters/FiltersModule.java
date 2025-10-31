package ru.ui.client.ui.filters;

import com.dlsc.workbenchfx.model.WorkbenchModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.controlsfx.control.PropertySheet;
import org.kordamp.ikonli.materialdesign2.MaterialDesignF;

/**
 * Filters module implemented via ControlsFX {@link PropertySheet}.
 */
public final class FiltersModule extends WorkbenchModule {

  private final BorderPane content = new BorderPane();

  /**
   * Creates a new filters module containing PropertySheet definitions.
   */
  public FiltersModule() {
    super("Filters", MaterialDesignF.FILTER);
    PropertySheet propertySheet = new PropertySheet();
    propertySheet.setMode(PropertySheet.Mode.CATEGORY);
    propertySheet.getItems().setAll(createItems());

    Button applyButton = new Button("Apply (coming in M2)");
    applyButton.setDisable(true);
    HBox footer = new HBox(applyButton);
    footer.setPadding(new Insets(12));

    content.setCenter(propertySheet);
    content.setBottom(footer);
  }

  private List<PropertySheet.Item> createItems() {
    List<PropertySheet.Item> items = new ArrayList<>();
    // Clouds category
    items.add(new FilterPropertyItem("Clouds", "Min trade size", "Minimum trade size to consider", Double.class, 100.0));
    items.add(new FilterPropertyItem("Clouds", "Min amount", "Minimum notional amount", Double.class, 1_000.0));
    items.add(new FilterPropertyItem("Clouds", "Side filter", "Allowed sides: BOTH/BUY/SELL", String.class, "BOTH"));
    items.add(new FilterPropertyItem("Clouds", "Max spread", "Maximum allowed spread", Double.class, 0.2));
    items.add(new FilterPropertyItem("Clouds", "MPID enabled", "Enable MPID enrichment", Boolean.class, Boolean.TRUE));
    items.add(new FilterPropertyItem("Clouds", "MPID top share", "Minimum top MPID share", Double.class, 0.6));
    items.add(new FilterPropertyItem("Clouds", "MPID streak min", "Minimum MPID streak length", Integer.class, 3));
    items.add(new FilterPropertyItem("Clouds", "Quality min", "Minimum quality score", Double.class, 0.5));

    // Cluster category
    items.add(new FilterPropertyItem("Cluster", "dt_ms", "Time granularity in milliseconds", Integer.class, 200));
    items.add(new FilterPropertyItem("Cluster", "dp_ticks", "Price granularity in ticks", Integer.class, 2));
    items.add(new FilterPropertyItem("Cluster", "Min cell volume", "Minimum volume per cell", Double.class, 10.0));
    items.add(new FilterPropertyItem("Cluster", "Min cluster volume", "Minimum volume per cluster", Double.class, 50.0));
    items.add(new FilterPropertyItem("Cluster", "Min trades", "Minimum trade count", Integer.class, 5));
    items.add(new FilterPropertyItem("Cluster", "Min intensity", "Minimum intensity", Double.class, 5.0));
    items.add(new FilterPropertyItem("Cluster", "Use delta", "Use delta thresholds", Boolean.class, Boolean.TRUE));
    items.add(new FilterPropertyItem("Cluster", "Delta min abs", "Minimum absolute delta", Double.class, 5.0));
    items.add(new FilterPropertyItem("Cluster", "MPID enabled", "Enable MPID metrics", Boolean.class, Boolean.FALSE));

    // VWAP category
    items.add(new FilterPropertyItem("VWAP", "Mode", "VWAP mode", String.class, "SESSION"));
    items.add(new FilterPropertyItem("VWAP", "Anchor timestamp", "ISO8601 anchor timestamp", String.class, ""));
    items.add(new FilterPropertyItem("VWAP", "Rolling window ms", "Rolling window in milliseconds", Integer.class, 600_000));
    items.add(new FilterPropertyItem("VWAP", "Bands mode", "Deviation band mode", String.class, "STD"));
    items.add(new FilterPropertyItem("VWAP", "Bands k", "Band multiplier", Double.class, 2.0));

    // Period VP category
    items.add(new FilterPropertyItem("Period VP", "Period type", "SESSION|CUSTOM_RANGE|ROLLING_WINDOW", String.class, "SESSION"));
    items.add(new FilterPropertyItem("Period VP", "From", "Start timestamp (ISO8601)", String.class, ""));
    items.add(new FilterPropertyItem("Period VP", "To", "End timestamp (ISO8601)", String.class, ""));
    items.add(new FilterPropertyItem("Period VP", "Rolling window ms", "Rolling window in milliseconds", Integer.class, 900_000));
    items.add(new FilterPropertyItem("Period VP", "Bin size ticks", "Number of ticks per bin", Integer.class, 1));
    items.add(new FilterPropertyItem("Period VP", "Value area ratio", "Value area ratio (0..1)", Double.class, 0.7));
    items.add(new FilterPropertyItem("Period VP", "Show delta", "Display delta component", Boolean.class, Boolean.TRUE));

    return items;
  }

  @Override
  public Node activate() {
    return content;
  }

  /**
   * Simple {@link PropertySheet.Item} implementation backed by an in-memory value.
   */
  private static final class FilterPropertyItem implements PropertySheet.Item {

    private final String category;
    private final String name;
    private final String description;
    private final Class<?> type;
    private Object value;

    private FilterPropertyItem(String category, String name, String description, Class<?> type, Object value) {
      this.category = category;
      this.name = name;
      this.description = description;
      this.type = type;
      this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public Class<?> getType() {
      return type;
    }

    /** {@inheritDoc} */
    @Override
    public String getCategory() {
      return category;
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
      return name;
    }

    /** {@inheritDoc} */
    @Override
    public String getDescription() {
      return description;
    }

    /** {@inheritDoc} */
    @Override
    public Object getValue() {
      return value;
    }

    /** {@inheritDoc} */
    @Override
    public void setValue(Object value) {
      this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public Optional<ObservableValue<?>> getObservableValue() {
      return Optional.empty();
    }
  }
}
