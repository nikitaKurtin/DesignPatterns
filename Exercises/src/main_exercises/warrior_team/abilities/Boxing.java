package main_exercises.warrior_team.abilities;

/**
 * strategy implementation
 */
public class Boxing implements FightAbility {
    @Override
    public void engage() {
        System.out.println("engaged with boxing ability");
    }
}
