package gof_exercisers.observer_property_changed.observers;

import gof_exercisers.observer_property_changed.observable.ObservableNumber;

public class PositiveObserver implements Observer {

    private ObservableNumber subject;

    public PositiveObserver(ObservableNumber subject) {

        this.subject = subject;
    }

    @Override
    public void onPropertyChanged() {
        if (subject.getNumber() > 0)
            System.out.println("Number is now positive");
    }

}
