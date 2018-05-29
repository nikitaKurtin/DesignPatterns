package gof_exercisers.observer_property_changed.observable;

import gof_exercisers.observer_property_changed.observers.Observer;

import java.util.ArrayList;

public class ObservableNumber implements PropertyChanged {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private double number;

    public ObservableNumber(int number) {
        setNumber(number);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
        notifyPropertyChanged();
    }

    @Override
    public void attach(Observer numberObserver) {
        observers.add(numberObserver);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyPropertyChanged() {
        for (Observer o : observers) {
            o.onPropertyChanged();
        }
    }
}
