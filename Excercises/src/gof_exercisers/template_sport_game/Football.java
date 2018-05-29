package gof_exercisers.template_sport_game;

public class Football extends SportGame {
    @Override
    void initialize() {
        System.out.println("starting football game, there are two teams");
    }

    @Override
    void startGame() {
        System.out.println("game started");
    }

    @Override
    void endGame() {
        System.out.println("Game over, team won");
    }
}
