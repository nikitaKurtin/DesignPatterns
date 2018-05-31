package gof_exercises.bridge_tv;

public class StepRemote implements AbsRemote {
    private int currentChannel;
    private TV implementor;

    StepRemote(TV implementor) {
        this.implementor = implementor;

        currentChannel = 0;
    }

    void NextChannel() {
        currentChannel++;
        getImplementor().tuneChannel(currentChannel);
    }

    public void PrevChannel() {
        currentChannel--;
        getImplementor().tuneChannel(currentChannel);
    }

    @Override
    public TV getImplementor() {
        return implementor;
    }
}
