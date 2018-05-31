package main_exercises.pizza_place;

import main_exercises.pizza_place.order.Order;
import main_exercises.pizza_place.order.Topping;
import main_exercises.pizza_place.places.PizzaDominos;
import main_exercises.pizza_place.places.PizzaHut;

/**
 * Client tester
 */
public class Test {
    public static void main(String[] args) {
        new PizzaHut()
                .orderPizza(new Order()
                        .setType("")
                        .addTopping(Topping.Olives)
                        .addTopping(Topping.Onions)
                        .addTopping(Topping.Tuna))
                .eat();

        new PizzaDominos()
                .orderPizza(new Order()
                        .setType("Kosher")
                        .addTopping(Topping.Mushrooms)
                        .addTopping(Topping.Onions))
                .eat();
    }
}
