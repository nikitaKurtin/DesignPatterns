package gof_exercisers.template_sport_game;

public class TemplateTest {
    public static void main(String[] args) {
        SportGame game = new Chess();
        game.play();

        game = new Football();
        game.play();
    }
}
