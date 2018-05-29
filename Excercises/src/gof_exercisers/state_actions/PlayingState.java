package gof_exercisers.state_actions;

public class PlayingState implements State {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }


    @Override
    public void toggle() {
        pause();
    }

    @Override
    public void play() {
        System.out.println("Already Playing!!");
    }

    @Override
    public void pause() {
        System.out.println("Now Pausing");
        player.setCurrentState(new PauseState(player));
    }
}
