package gof.behavior.strategy.abilities;

/**
 * Created by Gal on 8/24/2017.
 */
public enum IonCannon implements FightAbility {
    instance;


    @Override
    public void engage() {
        System.out.println("firing ion cannon!!");
    }
}
