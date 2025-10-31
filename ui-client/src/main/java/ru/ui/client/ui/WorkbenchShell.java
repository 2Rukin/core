package ru.ui.client.ui;

import com.dlsc.workbenchfx.Workbench;
import com.dlsc.workbenchfx.model.WorkbenchModule;
import java.util.List;
import java.util.Objects;
import javafx.scene.layout.BorderPane;
import ru.ui.client.config.UiClientProperties;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.buffers.TimeSeriesBuffer;
import ru.ui.client.model.buffers.TradeBuffer;
import ru.ui.client.model.clock.VirtualClockLite;
import ru.ui.client.ui.charts.ChartsModule;
import ru.ui.client.ui.explorer.TopicExplorerModule;
import ru.ui.client.ui.filters.FiltersModule;
import ru.ui.client.ui.tns.TimeAndSalesModule;
import ru.ui.client.ui.transport.TransportBar;

/**
 * High level container hosting the WorkbenchFX workspace and auxiliary UI elements.
 */
public final class WorkbenchShell extends BorderPane {

  /**
   * Creates a new Workbench shell instance that wires UI modules together.
   *
   * @param properties UI configuration
   * @param eventBus event bus for inter-module communication
   * @param clock virtual clock instance
   * @param timeSeriesBuffer shared bar buffer
   * @param tradeBuffer shared trade buffer
   */
  public WorkbenchShell(
      UiClientProperties properties,
      EventBus eventBus,
      VirtualClockLite clock,
      TimeSeriesBuffer timeSeriesBuffer,
      TradeBuffer tradeBuffer
  ) {
    Objects.requireNonNull(properties, "properties");
    Objects.requireNonNull(eventBus, "eventBus");
    Objects.requireNonNull(clock, "clock");
    Objects.requireNonNull(timeSeriesBuffer, "timeSeriesBuffer");
    Objects.requireNonNull(tradeBuffer, "tradeBuffer");
    Workbench workbench = new Workbench();

    ChartsModule chartsModule = new ChartsModule(eventBus, timeSeriesBuffer);
    TimeAndSalesModule tnsModule = new TimeAndSalesModule(eventBus, tradeBuffer);
    TopicExplorerModule explorerModule = new TopicExplorerModule(eventBus, properties);
    FiltersModule filtersModule = new FiltersModule();

    List<WorkbenchModule> modules = List.of(chartsModule, tnsModule, explorerModule, filtersModule);
    workbench.getModules().setAll(modules);
    workbench.openModule(chartsModule);

    setCenter(workbench);
    setTop(new TransportBar(eventBus, clock));
  }
}
