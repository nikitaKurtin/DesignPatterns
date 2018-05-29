package main_exercisers.pizza_place.topping_chain;

import main_exercisers.pizza_place.order.Topping;
import main_exercisers.pizza_place.pizza.Pizza;
import main_exercisers.pizza_place.toppings.WithTuna;

/**
 * Chain of Responsibilities
 */
public class TunaLink extends ToppingLink {
    @Override
    protected Topping getTopping() {
        return Topping.Tuna;
    }

    @Override
    protected Pizza handleRequest(Pizza pizza) {
        return new WithTuna(pizza);
    }
}
