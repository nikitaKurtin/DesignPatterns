package main_exercisers.warrior_team.warrior.commander;

import main_exercisers.warrior_team.warrior.Warrior;
import main_exercisers.warrior_team.warrior.WarriorMediator;

public class ChangeAbilityCommand implements WarriorCommand {
    private WarriorMediator comm;
    private String ability;

    public ChangeAbilityCommand(WarriorMediator comm, String ability) {
        this.comm = comm;
        this.ability = ability;
    }

    @Override
    public void execute() {
        for (Warrior w : comm.getWarriors()) {
            w.setAbility(ability);
        }
    }

    @Override
    public String getCommandInfo() {
        return "Change Abilities to " + ability;
    }
}
