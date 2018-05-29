package main_exercisers.pizza_place.topping_chain;

import main_exercisers.pizza_place.order.Topping;
import main_exercisers.pizza_place.pizza.Pizza;
import main_exercisers.pizza_place.toppings.WithOlives;

/**
 * Chain of Responsibilities
 */
public class OliveLink extends ToppingLink {
    @Override
    protected Topping getTopping() {
        return Topping.Olives;
    }

    @Override
    protected Pizza handleRequest(Pizza pizza) {
        return new WithOlives(pizza);
    }
}