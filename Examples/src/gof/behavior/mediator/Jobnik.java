package gof.behavior.mediator;

public class Jobnik {
    private String name, password;
    private TeamComm ct;

    public Jobnik(String name, String password, TeamComm ct) {
        this.name = name;
        this.password = password;
        this.ct = ct;

        ct.addColleague(this); //register to mediator
    }

    public void receiveMsg(String msg) {
        System.out.println(name + " has received message.");
    }

    public void sendMsg(String password, String msg) {
        if (this.password.equals(password)) {
            System.out.println(name + " sent: \"" + msg + '\"');
            ct.publishMessage(this, msg);
        }
    }
}
