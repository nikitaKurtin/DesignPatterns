package main_exercisers.warrior_team.warrior.commander;

import main_exercisers.warrior_team.warrior.Warrior;
import main_exercisers.warrior_team.warrior.WarriorMediator;

public class AttackCommand implements WarriorCommand {
    private WarriorMediator comm;

    public AttackCommand(WarriorMediator comm) {
        this.comm = comm;
    }

    @Override
    public void execute() {
        for (Warrior w : comm.getWarriors()) {
            w.engage();
        }
    }

    @Override
    public String getCommandInfo() {
        return "Attack";
    }
}
