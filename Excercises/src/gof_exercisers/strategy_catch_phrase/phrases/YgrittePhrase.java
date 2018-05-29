package gof_exercisers.strategy_catch_phrase.phrases;

import gof_exercisers.strategy_catch_phrase.CatchPhrase;

public class YgrittePhrase implements CatchPhrase {
    @Override
    public void sayPhrase() {
        System.out.println("You know nothing, John Snow");
    }

    @Override
    public boolean isGood() {
        return true;
    }
}
