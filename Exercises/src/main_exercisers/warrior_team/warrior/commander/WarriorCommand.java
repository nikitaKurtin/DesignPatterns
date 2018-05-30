package main_exercisers.warrior_team.warrior.commander;

import main_exercisers.warrior_team.warrior.Warrior;
import main_exercisers.warrior_team.warrior.WarriorMediator;

public interface WarriorCommand {
    void execute();

    String getCommandInfo();
}

