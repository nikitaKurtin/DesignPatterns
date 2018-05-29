package gof.behavior.strategy.abilities;

/**
 * Created by Gal on 8/24/2017.
 */
public class Kick implements FightAbility {

    @Override
    public void engage() {
        System.out.println("Kicking round kick");
    }
}
