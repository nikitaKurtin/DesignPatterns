package main_exercises.pizza_place.places;

import main_exercises.pizza_place.topping_chain.MushroomLink;
import main_exercises.pizza_place.topping_chain.OliveLink;
import main_exercises.pizza_place.topping_chain.OnionLink;
import main_exercises.pizza_place.topping_chain.TunaLink;
import main_exercises.pizza_place.order.Topping;
import main_exercises.pizza_place.pizza.Pizza;
import main_exercises.pizza_place.pizza.ThickPizza;
import main_exercises.pizza_place.pizza.ThinPizza;

import java.util.Set;

/**
 * Facade for creating pizza
 * factory method
 */
public class PizzaHut extends PizzaPlace {

    public PizzaHut() {
        //building topping_chain of responsibilities
        //Implementing method chaining
        chain = new OliveLink()
                .setSuccessor(new TunaLink()
                        .setSuccessor(new OnionLink()
                                .setSuccessor(new MushroomLink())));
    }

    @Override
    protected Pizza create(String type) {
        switch (type.toLowerCase()) {
            case "big":
            case "thick":
                return new ThickPizza();
            default:
                return new ThinPizza();
        }
    }

    @Override
    protected Pizza putToppings(Pizza pizza, Set<Topping> toppings) {
        return chain.processRequest(pizza, toppings);
    }
}