package gof.behavior.strategy.abilities;

/**
 * Created by Gal on 8/24/2017.
 */
public class FightingAbilityFactory {
    public static FightAbility createAbility(String ability_name) {
        switch (ability_name.toLowerCase()) {
            case "gun":
            case "shooting":
                return new Gun();

            case "cannon":
            case "ioncannon":
            case "ion-cannon":
                return IonCannon.instance;

            case "kick":
            case "kicking":
                return new Kick();

            case "punch":
            case "boxing":
            default:
                return new Punch();
        }
    }
}
