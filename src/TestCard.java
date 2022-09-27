import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCard {

    public static void run() {
        Card c1 = new Card(Suit.HEARTS, Ranks.EIGHT);
        Card joker = new Card(Joker.JOKER);
        CardDeck newDeck = new CardDeck();
        newDeck.addThreeJokers();
        System.out.println("This is our deck " + newDeck.createdDeck());
        Collections.shuffle(newDeck.getNewDeck());

        System.out.println("This is our shuffled deck " + newDeck.createdDeck());

        CardDeck.getNext();
        CardDeck.getLast();

        System.out.println(joker);





    }

    public static void main(String[] args) {
        run();
    }
}