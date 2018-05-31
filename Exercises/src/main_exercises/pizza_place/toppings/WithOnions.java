package main_exercises.pizza_place.toppings;

import main_exercises.pizza_place.pizza.Pizza;

/**
 * Decorator
 */
public class WithOnions implements Pizza {
    private Pizza pizza;

    public WithOnions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void eat() {
        pizza.eat();
        System.out.println("\twith Onions");
    }
}
