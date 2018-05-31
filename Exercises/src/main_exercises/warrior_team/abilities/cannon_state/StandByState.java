package main_exercises.warrior_team.abilities.cannon_state;

import main_exercises.warrior_team.abilities.IONCannon;

public class StandByState implements CannonState {
    private IONCannon context;

    public StandByState(IONCannon context) {
        this.context = context;
        System.out.println("ION Cannon is Standing by");
    }

    @Override
    public void requestToAttack() {
        System.out.println("Now Attacking");
        context.setState(new FiringState(context));
    }
}
