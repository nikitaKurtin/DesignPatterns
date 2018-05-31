package main_exercises.warrior_team.warrior.commander;

public class Commander {
    private String name;

    public Commander(String name) {
        this.name = name;
    }

    public void callCommand(WarriorCommand cmd) {
        System.out.println("Commander " + name + " order to " + cmd.getCommandInfo());
        cmd.execute();
    }
}
