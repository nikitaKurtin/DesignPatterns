package gof_exercisers.state_actions;

public class PauseState implements State {
    private Player player;

    public PauseState(Player player) {
        this.player = player;
    }

    @Override
    public void toggle() {
        play();
    }

    @Override
    public void play() {
        System.out.println("Now Playing");
        player.setCurrentState(new PlayingState(player));
    }

    @Override
    public void pause() {
        System.out.println("Already in Pause");
    }
}
