package gof_exercises.state_actions;

public class StateTest {
    public static void main(String[] args) {
        Player player = new Player();

        player.togglePlay(); //toggle to play
        player.playMusic(); //already playing
        player.togglePlay(); //toggle to pause
        player.pauseMusic(); //already paused
    }
}
