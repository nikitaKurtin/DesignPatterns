package gof.behavior.mediator;

import gof.behavior.mediator.warriors.Warrior;

import java.util.ArrayList;

/**
 * Created by Gal on 8/24/2017.
 */
//Our mediator
public class TeamComm {
    private ArrayList<Warrior> warriors;
    private ArrayList<Jobnik> jobniks;

    TeamComm() {
        this.warriors = new ArrayList<>();
        this.jobniks = new ArrayList<>();
    }

    public void publishMessage(Object sender, String msg) {
        for (Warrior warrior : warriors) {
            if (warrior.equals(sender)) continue;
            warrior.receiveMessage(msg);
        }
        for (Jobnik jobnik : jobniks) {
            if (jobnik.equals(sender)) continue;
            jobnik.receiveMsg(msg);
        }
    }

    public void addColleague(Warrior warrior) {
        warriors.add(warrior);
    }

    public void addColleague(Jobnik jobnik) {
        jobniks.add(jobnik);
    }
}
