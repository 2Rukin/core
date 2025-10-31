package ru.ui.client.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/**
 * Lightweight publish/subscribe bus tailored for UI events.
 */
public final class EventBus {

  private final Map<Class<?>, List<Subscriber<?>>> subscribers = new ConcurrentHashMap<>();

  /**
   * Subscribes the provided consumer to events of the given type.
   *
   * @param type event type
   * @param consumer callback invoked on the JavaFX application thread
   * @param <T> event type
   * @return subscription handle that must be closed to unsubscribe
   */
  public <T> Subscription subscribe(Class<T> type, Consumer<? super T> consumer) {
    Objects.requireNonNull(type, "type");
    Objects.requireNonNull(consumer, "consumer");
    Subscriber<T> subscriber = new Subscriber<>(type, consumer);
    subscribers.computeIfAbsent(type, key -> new CopyOnWriteArrayList<>()).add(subscriber);
    return () -> subscribers.getOrDefault(type, List.of()).remove(subscriber);
  }

  /**
   * Publishes an event to all matching subscribers.
   *
   * @param event event instance
   */
  public void publish(Object event) {
    if (event == null) {
      return;
    }
    Class<?> eventType = event.getClass();
    subscribers.forEach((type, handlers) -> {
      if (type.isAssignableFrom(eventType)) {
        for (Subscriber<?> handler : handlers) {
          handler.dispatch(event);
        }
      }
    });
  }

  private record Subscriber<T>(Class<T> type, Consumer<? super T> consumer) {

    @SuppressWarnings("unchecked")
    void dispatch(Object event) {
      consumer.accept((T) event);
    }
  }

  /**
   * Disposable subscription handle.
   */
  @FunctionalInterface
  public interface Subscription extends AutoCloseable {

    /**
     * Cancels the subscription.
     */
    @Override
    void close();
  }
}
