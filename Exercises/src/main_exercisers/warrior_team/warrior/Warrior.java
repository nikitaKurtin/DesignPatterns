package main_exercisers.warrior_team.warrior;

import main_exercisers.warrior_team.abilities.FightAbility;
import main_exercisers.warrior_team.abilities.FightAbilityFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * Composite Pattern implementation
 * Method chaining implementation
 */
public class Warrior {
    private String name;
    private FightAbility currentAbility;
    private WarriorMediator comm;

    //composite field
    private List<Warrior> subWarriors;

    //package-private constructor to force factory
    Warrior() {
        subWarriors = new ArrayList<>();
    }

    //getters
    public String getName() {
        return name;
    }

    public FightAbility getAbility() {
        return currentAbility;
    }

    public WarriorMediator getComm() {
        return comm;
    }

    //setters
    private void setName(String name) {
        this.name = name;
    }

    public void changeChannel(int channel) {
        comm.removeWarrior(this);
        this.comm = WarriorMediator.getComm(channel);
        comm.addWarrior(this);
    }

    public void setAbility(String newAbility) {
        this.currentAbility = FightAbilityFactory.getInstance().getAbility(newAbility);
        System.out.println(getName() + " has change ability to " + currentAbility.getClass().getSimpleName());
    }

    //communication methods
    public void sendMessage(String msg) {
        System.out.println(this.name + ": " + msg);
        comm.broadcastMessage(this);
    }

    void receiveMessage(Warrior sender) {
        System.out.println(getName() + " has received message from " + sender.getName());
    }

    //strategy method
    public void engage() {
        System.out.print(getName() + " is engaging ");
        getAbility().engage();
    }

    //Composite methods
    public void teamEngage() {
        engage();
        if (subWarriors.size() > 0) {
            System.out.println("Team " + getName() + " is engaging");
            for (Warrior warrior : subWarriors) {
                warrior.teamEngage();
            }
        }
    }

    /**
     * @param warrior new warrior to be in the composite
     * @return the caller to able method chaining
     */
    public Warrior addSubWarrior(Warrior warrior) {
        subWarriors.add(warrior);
        return this;
    }

    //Factory methods
    public static Warrior createWarrior(String name) {
        Warrior temp = new Warrior();
        temp.setName(name);
        temp.setAbility("punch");
        temp.comm = WarriorMediator.getComm(1);
        temp.comm.addWarrior(temp);
        return temp;
    }

    public static Warrior createWarrior() {
        return createWarrior("Incognito");
    }
}
