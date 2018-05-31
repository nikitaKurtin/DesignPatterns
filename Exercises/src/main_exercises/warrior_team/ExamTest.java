package main_exercises.warrior_team;

import main_exercises.warrior_team.warrior.SuperSuit;
import main_exercises.warrior_team.warrior.Warrior;
import main_exercises.warrior_team.warrior.WarriorMediator;
import main_exercises.warrior_team.warrior.commander.AttackCommand;
import main_exercises.warrior_team.warrior.commander.ChangeAbilityCommand;
import main_exercises.warrior_team.warrior.commander.Commander;

/**
 * Testing Class
 */
public class ExamTest {
    public static void main(String[] args) {
        Warrior gal = Warrior.createWarrior("gal");
        Warrior lera = Warrior.createWarrior("Lera");
        Warrior nikita = Warrior.createWarrior("Nikita");
        Warrior marina = Warrior.createWarrior("Marina");
        Warrior bubu = Warrior.createWarrior("Bubu");
        Warrior groot = Warrior.createWarrior("Groot");
        Warrior foo = Warrior.createWarrior("Foo");
        Warrior stealth = Warrior.createWarrior();
        SuperSuit suit = new SuperSuit(stealth);
        System.out.println();


        //changing mediator channel (controlling communication with mediator)
        gal.changeChannel(2);
        stealth.changeChannel(2);
        marina.changeChannel(2);

        //changing abilities
        lera.setAbility("Cannon");
        gal.setAbility("Cannon");
        foo.setAbility("KICK");
        System.out.println();

        //mediator + strategy calls
        gal.sendMessage("hello team 2");
        marina.setAbility("punch");
        marina.engage();

        nikita.sendMessage("what channel is that?");
        bubu.sendMessage("Channel 1");

        //decorator calls
        suit.engage();
        suit.setAdditionalAbility("shooting");
        suit.sendMessage("Hi");

        //composite calls
        gal.addSubWarrior(lera)
                .addSubWarrior(stealth)
                .addSubWarrior(groot)
                .addSubWarrior(nikita);
        gal.teamEngage();

        Commander commander = new Commander("Chief");
        commander.callCommand(new AttackCommand(WarriorMediator.getComm(0)));
        commander.callCommand(new ChangeAbilityCommand(WarriorMediator.getComm(0),"Kick"));
        commander.callCommand(new AttackCommand(WarriorMediator.getComm(0)));
    }
}
