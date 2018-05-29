package gof.behavior.mediator;

import gof.behavior.mediator.warriors.Fighter;
import gof.behavior.mediator.warriors.Intel;

/**
 * Created by Gal on 8/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        TeamComm comm = new TeamComm();

        Intel bubuIntel = new Intel("bubu intel", comm);
        new Intel("Groot intel", comm);

        new Fighter("Deadpool fighter", comm);
        Fighter givatiFighter = new Fighter("givati fighter", comm);

        bubuIntel.sendMessage("this is an intel");

        givatiFighter.sendMessage("requesting permission to attack");

        Jobnik jo = new Jobnik("Foo", "123", comm);
        jo.sendMsg("____", "BuilderTest For failure");
        jo.sendMsg("123", "Hello everyone");
    }
}
