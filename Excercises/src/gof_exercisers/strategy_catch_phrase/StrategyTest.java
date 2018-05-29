package gof_exercisers.strategy_catch_phrase;

import gof_exercisers.strategy_catch_phrase.phrases.*;

public class StrategyTest {
    public static void main(String[] args) {
        Fan me = new Fan();

        me.changePhrase(new JoeyPhrase());
        me.sayPhrase();

        me.changePhrase(new YgrittePhrase());
        me.sayPhrase();
    }
}
