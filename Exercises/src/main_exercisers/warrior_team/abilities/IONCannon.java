package main_exercisers.warrior_team.abilities;

import main_exercisers.warrior_team.abilities.cannon_state.CannonState;
import main_exercisers.warrior_team.abilities.cannon_state.StandByState;

/**
 * strategy implementation
 */
public class IONCannon implements FightAbility {
    private CannonState state;

    private static IONCannon instance;

    private IONCannon() {
        state = new StandByState(this);
    }

    @Override
    public void engage() {
        System.out.println("Calling ION - Cannon");
        state.requestToAttack();
    }

    static IONCannon getIONCannon() {
        if (instance == null)
            instance = new IONCannon();
        return instance;
    }

    public void setState(CannonState state) {
        this.state = state;
    }
}
