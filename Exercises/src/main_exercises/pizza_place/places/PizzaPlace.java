package main_exercises.pizza_place.places;

import main_exercises.pizza_place.topping_chain.ToppingLink;
import main_exercises.pizza_place.order.Order;
import main_exercises.pizza_place.order.Topping;
import main_exercises.pizza_place.pizza.Pizza;

import java.util.Set;

/**
 * Template method for creating pizza
 */
public abstract class PizzaPlace {
    ToppingLink chain;

    protected abstract Pizza create(String size);

    protected abstract Pizza putToppings(Pizza pizza, Set<Topping> toppings);

    /**
     * Template Method
     */
    public final Pizza orderPizza(Order order) {
        try {
            System.out.println("making");
            Pizza new_pizza = create(order.getType());
            Thread.sleep(1000);

            System.out.println("adding toppings");
            new_pizza = putToppings(new_pizza, order.getToppings());
            Thread.sleep(1000);

            System.out.println("Delivering");
            Thread.sleep(1000);
            return new_pizza;
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException("interrupted");
        }
    }
}
