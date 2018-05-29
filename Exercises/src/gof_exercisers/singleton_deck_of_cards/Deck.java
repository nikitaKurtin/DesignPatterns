package gof_exercisers.singleton_deck_of_cards;

import java.util.ArrayList;

public class Deck {
    public static Deck instance = new Deck();
    public final ArrayList<String> cards;

    private Deck() {
        cards = new ArrayList<>();
        cards.add("Jack D");
        cards.add("Jack H");
        cards.add("Jack S");
        cards.add("Jack C");
    }
}
