package ru.ui.client.ui.transport;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import ru.ui.client.model.EventBus;
import ru.ui.client.model.clock.VirtualClockLite;
import ru.ui.client.model.events.ConnectionStateEvent;
import ru.ui.client.model.events.VirtualTimeUpdateEvent;

/**
 * Top toolbar displaying transport indicators such as source, mode and virtual time.
 */
public final class TransportBar extends HBox {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter
      .ofPattern("yyyy-MM-dd HH:mm:ss")
      .withZone(ZoneId.systemDefault());

  private final Label statusLabel = new Label("Status: Connecting");
  private final Label virtualTimeLabel = new Label("VT: --");

  /**
   * Creates a new transport bar component.
   *
   * @param eventBus event bus providing connectivity events
   * @param clock virtual clock instance
   */
  public TransportBar(EventBus eventBus, VirtualClockLite clock) {
    Objects.requireNonNull(eventBus, "eventBus");
    Objects.requireNonNull(clock, "clock");
    Label sourceLabel = new Label("Source: direct-kafka");
    Label modeLabel = new Label("Mode: LIVE");

    setSpacing(16);
    setPadding(new Insets(8, 16, 8, 16));
    getChildren().addAll(sourceLabel, modeLabel, virtualTimeLabel, statusLabel);

    eventBus.subscribe(ConnectionStateEvent.class, event -> Platform.runLater(() ->
        statusLabel.setText("Status: " + event.state() + " — " + event.message())
    ));
    eventBus.subscribe(VirtualTimeUpdateEvent.class, event -> Platform.runLater(() ->
        virtualTimeLabel.setText(
            "VT: " + FORMATTER.format(event.virtualTime()) +
                " (Δ " + event.drift().abs().toSeconds() + "s)"
        )
    ));
    virtualTimeLabel.setText(
        "VT: " + FORMATTER.format(clock.now()) +
            " (Δ " + clock.drift().abs().toSeconds() + "s)"
    );
  }
}
