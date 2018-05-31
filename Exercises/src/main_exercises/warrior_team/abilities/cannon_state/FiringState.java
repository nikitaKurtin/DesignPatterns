package main_exercises.warrior_team.abilities.cannon_state;

import main_exercises.warrior_team.abilities.IONCannon;

public class FiringState implements CannonState {

    FiringState(final IONCannon context) {
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            context.setState(new StandByState(context));
        }).start();
    }

    @Override
    public void requestToAttack() {
        System.out.println("ION cannon Busy now, try again later");
    }
}
