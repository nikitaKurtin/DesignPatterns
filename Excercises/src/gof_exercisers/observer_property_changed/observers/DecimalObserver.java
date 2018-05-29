package gof_exercisers.observer_property_changed.observers;


import gof_exercisers.observer_property_changed.observable.ObservableNumber;

public class DecimalObserver implements Observer {
    private ObservableNumber subject;

    public DecimalObserver(ObservableNumber subject) {
        this.subject = subject;
    }

    @Override
    public void onPropertyChanged() {
        System.out.printf("Showing value after decimal point %.2f\n", subject.getNumber() % 1);
//        System.out.println("Showing value after decimal point " + subject.getNumber() % 1);
    }
}
