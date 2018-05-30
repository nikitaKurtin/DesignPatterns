package gof.creational.factory_method;

import gof.creational.factory_method.pizza.Pizza;
import gof.creational.factory_method.pizza.PizzaFactory;

/**
 * Created by Gal on 8/23/2017.
 */
public class FactoryTest {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza p = factory.createPizza("israeli");
        p.setToppings(new String[]{"Garlic", "Mushrooms", "Tuna"});
        System.out.println(p);

        Pizza p2 = factory.createIsraeliPizza();
    }
}
