import java.util.ArrayList;

public class TestCard {

    public static void run() {
        Card c1 = new Card(Suit.HEARTS, Rank.EIGHT);
        CardDeck newDeck = new CardDeck(new ArrayList<>());
        newDeck.createCardDeck();
        System.out.println("This is our deck " + newDeck.createdDeck());


    }

    public static void main(String[] args) {
        run();
    }
}