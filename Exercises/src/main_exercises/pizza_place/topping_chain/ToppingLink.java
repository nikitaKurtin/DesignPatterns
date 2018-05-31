package main_exercises.pizza_place.topping_chain;

import main_exercises.pizza_place.order.Topping;
import main_exercises.pizza_place.pizza.Pizza;

import java.util.Set;

/**
 * Chain of responsibility
 * Method chaining
 * Template method
 */
public abstract class ToppingLink {
    protected ToppingLink successor;

    public ToppingLink setSuccessor(ToppingLink successor) {
        this.successor = successor;
        //method chaining
        return this;
    }

    protected abstract Topping getTopping();

    protected abstract Pizza handleRequest(Pizza pizza);

    /**
     * Template method to handle request. each link handle req differently
     */
    public final Pizza processRequest(Pizza pizza, Set<Topping> toppings) {
        //search for topping

        if (toppings.contains(getTopping())) {
            //handle request
            pizza = handleRequest(pizza);
        }
        //if done with topping_chain then return the result
        if (successor == null) return pizza;

        //else go to next and handle pizza
        return successor.processRequest(pizza, toppings);
    }
}
