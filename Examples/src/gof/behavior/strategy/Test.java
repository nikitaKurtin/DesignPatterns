package gof.behavior.strategy;

/**
 * Created by Gal on 8/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        Warrior fighter = new Warrior();
        fighter.attack();

        fighter.setAbility("cannon");
        fighter.attack();

        fighter.setAbility("GUN");
//        fighter.setAbility("Kicking");
        fighter.attack();
    }
}
