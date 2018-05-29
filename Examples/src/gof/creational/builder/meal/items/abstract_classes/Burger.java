package gof.creational.builder.meal.items.abstract_classes;

import gof.creational.builder.meal.packing.Packing;
import gof.creational.builder.meal.packing.Wrapper;

/**
 * Created by Gal on 8/24/2017.
 */
public abstract class Burger implements EatableItem{
    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

    @Override
    public abstract double getPrice();
}
