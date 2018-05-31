package gof_exercises.observer_property_changed.observable;

import gof_exercises.observer_property_changed.observers.Observer;

public interface PropertyChanged {
    void notifyPropertyChanged();

    void attach(Observer o);

    void detach(Observer o);
}
