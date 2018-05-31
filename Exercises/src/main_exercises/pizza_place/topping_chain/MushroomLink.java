package main_exercises.pizza_place.topping_chain;

import main_exercises.pizza_place.order.Topping;
import main_exercises.pizza_place.pizza.Pizza;
import main_exercises.pizza_place.toppings.WithMushrooms;

/**
 * Chain of Responsibilities
 */
public class MushroomLink extends ToppingLink {
    @Override
    protected Topping getTopping() {
        return Topping.Mushrooms;
    }

    @Override
    protected Pizza handleRequest(Pizza pizza) {
        return new WithMushrooms(pizza);
    }
}
