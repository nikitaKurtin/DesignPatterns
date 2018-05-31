package main_exercises.pizza_place.topping_chain;

import main_exercises.pizza_place.order.Topping;
import main_exercises.pizza_place.pizza.Pizza;
import main_exercises.pizza_place.toppings.WithOnions;

/**
 * Chain of Responsibilities
 */
public class OnionLink extends ToppingLink {
    @Override
    protected Topping getTopping() {
        return Topping.Onions;
    }

    @Override
    protected Pizza handleRequest(Pizza pizza) {
        return new WithOnions(pizza);
    }
}
