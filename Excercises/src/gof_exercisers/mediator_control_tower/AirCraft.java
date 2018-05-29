package gof_exercisers.mediator_control_tower;

public class AirCraft {
    //Every AirCraft has: name & mediator
    private String name;
    private Mediator mdtr;

    //When Aircraft created - it needs a name & mediator
    public AirCraft(String name, Mediator mdtr) {
        this.mdtr = mdtr;
        this.mdtr.registration(this);
        this.name = name;
    }

    //Every Aircraft can send message - accessible from outside
    public void sendMessage(String msg) {
        System.out.println(this.name + " sent: " + msg);
        this.mdtr.passMsg(msg, this);
    }

    //Every Aircraft can receive message - encapsulated to package
    void receiveMessage(String msg) {
        System.out.println(this.name + " received: " + msg);
    }
}
