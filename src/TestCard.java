import java.util.ArrayList;

public class TestCard {

    public static void run() {
        Card c1 = new Card(Suit.HEARTS, Ranks.EIGHT);
        Card joker = new Card(Joker.JOKER);
        CardDeck newDeck = new CardDeck();
        newDeck.addThreeJokers();

        System.out.println(joker);


        System.out.println("This is our deck " + newDeck.createdDeck());


    }

    public static void main(String[] args) {
        run();
    }
}