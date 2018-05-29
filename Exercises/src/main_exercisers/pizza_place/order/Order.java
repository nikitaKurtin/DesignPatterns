package main_exercisers.pizza_place.order;

import java.util.HashSet;
import java.util.Set;

/**
 * Builder class for order
 * Method chaining
 * Lazy loading
 */
public class Order {
    private String type;
    private Set<Topping> toppings;

    public Order addTopping(Topping top) {
        if (toppings == null)
            toppings = new HashSet<>();
        toppings.add(top);
        return this;
    }

    public Order setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public Set<Topping> getToppings() {
        return toppings;
    }
}

