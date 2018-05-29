package main_exercisers.warrior_team.abilities;

/**
 * strategy implementation
 */
public class Shooting implements FightAbility {
    @Override
    public void engage() {
        System.out.println("engaged with Shooting Ability");
    }
}
