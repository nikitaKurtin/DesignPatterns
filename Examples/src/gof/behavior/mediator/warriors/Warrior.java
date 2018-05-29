package gof.behavior.mediator.warriors;

import gof.behavior.mediator.TeamComm;

/**
 * Created by Gal on 8/24/2017.
 */
public abstract class Warrior {
    private String name;
    private TeamComm ct;

    Warrior(String name, TeamComm ct) {
        this.name = name;
        this.ct = ct;

        ct.addColleague(this); //register to mediator
    }

    public void sendMessage(String msg) {
        System.out.println(name + " sent: " + msg);
        ct.publishMessage(this, msg);
    }

    public void receiveMessage(String msg) {
        System.out.println(name + " received: message.");
    }
}
