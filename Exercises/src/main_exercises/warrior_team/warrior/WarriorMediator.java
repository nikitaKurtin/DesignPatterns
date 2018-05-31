package main_exercises.warrior_team.warrior;

import java.util.ArrayList;

/**
 * Mediator Pattern, to handle warriors communications
 */
public class WarriorMediator {
    private static WarriorMediator COMM_ONE;
    private static WarriorMediator COMM_TWO;
    private ArrayList<Warrior> warriors;

    private WarriorMediator() {
        this.warriors = new ArrayList<>();
    }

    public static WarriorMediator getComm(int channel) {
        if (channel == 1)
            return LazyLoadCommONE();
        else
            return LazyLoadCommTWO();
    }

    private static WarriorMediator LazyLoadCommTWO() {
        if (COMM_TWO == null)
            COMM_TWO = new WarriorMediator();
        return COMM_TWO;
    }

    private static WarriorMediator LazyLoadCommONE() {
        if (COMM_ONE == null)
            COMM_ONE = new WarriorMediator();
        return COMM_ONE;
    }

    void addWarrior(Warrior newWarrior) {
        this.warriors.add(newWarrior);
    }

    void broadcastMessage(Warrior sender) {
        for (Warrior w : this.warriors) {
            if (w == sender) continue;
            w.receiveMessage(sender);
        }
        System.out.println();
    }

    void removeWarrior(Warrior warrior) {
        warriors.remove(warrior);
    }

    public ArrayList<Warrior> getWarriors() {
        return warriors;
    }
}
