package gof_exercisers.state_actions;

public class Player {
    private State mCurrentState;

    public Player() {
        setCurrentState(new PauseState(this));
    }

    public State getCurrentState() {
        return mCurrentState;
    }

    public void setCurrentState(State currentState) {
        this.mCurrentState = currentState;
    }

    public void togglePlay() {
        System.out.println("Toggling state");
        mCurrentState.toggle();
    }

    public void playMusic() {
        mCurrentState.play();
    }

    public void pauseMusic() {
        mCurrentState.pause();
    }
}
