package gof_exercisers.observer_property_changed;

import gof_exercisers.observer_property_changed.observable.ObservableNumber;
import gof_exercisers.observer_property_changed.observers.DecimalObserver;
import gof_exercisers.observer_property_changed.observers.PositiveObserver;

/**
 * Created by Gal on 8/26/2017.
 */
public class ObserverTest {
    public static void main(String[] args) {
        ObservableNumber oNumber = new ObservableNumber(10);

        //attaching observers
        oNumber.attach(new DecimalObserver(oNumber));
        oNumber.attach(new PositiveObserver(oNumber));


        //changing number (which notifies observers)
        oNumber.setNumber(10.3);

        oNumber.setNumber(-180.80008);

        oNumber.setNumber(9);

    }
}
