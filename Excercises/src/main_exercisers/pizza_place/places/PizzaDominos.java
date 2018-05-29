package main_exercisers.pizza_place.places;

import main_exercisers.pizza_place.topping_chain.MushroomLink;
import main_exercisers.pizza_place.topping_chain.OliveLink;
import main_exercisers.pizza_place.topping_chain.OnionLink;
import main_exercisers.pizza_place.order.Topping;
import main_exercisers.pizza_place.pizza.KosherPizza;
import main_exercisers.pizza_place.pizza.Pizza;
import main_exercisers.pizza_place.pizza.ThinPizza;

import java.util.Set;

public class PizzaDominos extends PizzaPlace {

    public PizzaDominos() {
        //building topping_chain of responsibilities
        //Implementing method chaining
        chain = new MushroomLink()
                .setSuccessor(new OliveLink()
                        .setSuccessor(new MushroomLink()
                                .setSuccessor(new OnionLink())));
    }

    @Override
    protected Pizza create(String type) {
        return type.equalsIgnoreCase("kosher") ? new KosherPizza() : new ThinPizza();
    }

    @Override
    protected Pizza putToppings(Pizza pizza, Set<Topping> toppings) {
        return chain.processRequest(pizza, toppings);
    }
}
