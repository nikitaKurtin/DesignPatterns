package gof_exercises.bridge_tv;

public interface AbsRemote {
    default void on() {
        getImplementor().on();
    }

    default void off() {
        getImplementor().off();
    }

    TV getImplementor();
}
