package gof.creational.builder.meal.items.abstract_classes;

import gof.creational.builder.meal.packing.Bottle;
import gof.creational.builder.meal.packing.Packing;

/**
 * Created by Gal on 8/24/2017.
 */
public abstract class ColdDrink implements EatableItem {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
