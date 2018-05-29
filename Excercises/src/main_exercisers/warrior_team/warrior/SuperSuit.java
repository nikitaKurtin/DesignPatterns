package main_exercisers.warrior_team.warrior;

import main_exercisers.warrior_team.abilities.FightAbility;
import main_exercisers.warrior_team.abilities.FightAbilityFactory;

/**
 * Decorator Pattern, SuperSuits decorates Warrior with another ability
 */
public class SuperSuit {
    private Warrior mWarrior;
    private FightAbility mAdditionalPower;

    public SuperSuit(Warrior warrior) {
        this.mWarrior = warrior;
    }

    public FightAbility getAdditionalPower() {
        if (mAdditionalPower == null) {
            mAdditionalPower = FightAbilityFactory.getInstance().getAbility("cannon");
            System.out.println("Lazy loading Ability");
        }
        return mAdditionalPower;
    }

    public void engage() {
        System.out.println(getName() + " is engaging:");
        System.out.print("\t");
        mWarrior.engage();
        System.out.print("\t");
        getAdditionalPower().engage();
    }

    public void setAdditionalAbility(String additionalAbility) {
        mAdditionalPower = FightAbilityFactory.getInstance().getAbility(additionalAbility);
        System.out.println(getName() + " has change ability to " + mAdditionalPower.getClass().getSimpleName());
    }

    private String getName() {
        return mWarrior.getName();
    }

    public FightAbility getAbility() {
        return mWarrior.getAbility();
    }

    public WarriorMediator getComm() {
        return mWarrior.getComm();
    }

    public void changeChannel(int channel) {
        mWarrior.changeChannel(channel);
    }

    public void setAbility(String newAbility) {
        mWarrior.setAbility(newAbility);
    }

    public void sendMessage(String msg) {
        mWarrior.sendMessage(msg);
    }

    void receiveMessage(Warrior sender) {
        mWarrior.receiveMessage(sender);
    }
}
