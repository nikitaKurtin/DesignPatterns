package gof_exercises.mediator_control_tower;

import java.util.ArrayList;

public class Mediator {
    private ArrayList<AirCraft> aircrafts;//All Aircrafts - assigned to this Mediator

    //When Mediator created - it has empty array of Aircrafts
    public Mediator() {
        this.aircrafts = new ArrayList<>();
    }

    //adding new AirCraft to this Mediator
    void registration(AirCraft aircraft) {
        int count = this.aircrafts.size();//store current count
        this.aircrafts.add(aircraft);//add new
    }

    //pass given message to all assigned Aircrafts
    void passMsg(String msg, AirCraft sender) {
        for (AirCraft ac : aircrafts) {//iterate over all aircrafts
            if (sender != ac) ac.receiveMessage(msg);//pass to all, except the sender
        }
    }
}
