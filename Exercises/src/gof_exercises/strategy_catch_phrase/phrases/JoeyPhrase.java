package gof_exercises.strategy_catch_phrase.phrases;

import gof_exercises.strategy_catch_phrase.CatchPhrase;

public class JoeyPhrase implements CatchPhrase {
    @Override
    public void sayPhrase() {
        System.out.println("How are you doing?");
    }

    @Override
    public boolean isGood() {
        return false;
    }
}
