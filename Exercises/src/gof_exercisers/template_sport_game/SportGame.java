package gof_exercisers.template_sport_game;

public abstract class SportGame {
    abstract void initialize();

    abstract void startGame();

    abstract void endGame();

    protected final void play() {
        initialize();
        startGame();
        endGame();
        System.out.println();
    }
}
