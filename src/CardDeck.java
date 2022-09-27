import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static List<Card> newDeck = new ArrayList<>();

    public List<Card> getNewDeck() {
        return newDeck;
    }

    public void setNewDeck(List<Card> newDeck) {
        CardDeck.newDeck = new ArrayList<>();
    }

    // METHODS -----------------------------
    public void createCardDeck() {
        for (Suit suit : Suit.values()) {
            for (Ranks rank : Ranks.values()) {
                newDeck.add(new Card(suit,rank));
            }
        }
    }

    public void addJoker() {
        newDeck.add(new Card(Joker.JOKER));
    }

    public void addTwoJokers() {
        addJoker();
        addJoker();
    }

    public void addThreeJokers() {
        addJoker();
        addJoker();
        addJoker();
    }

    // CONSTRUCTOR -------------------------
    public CardDeck() {
        createCardDeck();
    }

    public static Card getNext() {
        Card nextCard = newDeck.get(0);
        System.out.println(newDeck.get(0));
        CardDeck.newDeck.remove(0);
        return nextCard;
    }

    public static Card getLast() {
        Card lastCard = newDeck.get(newDeck.size() - 1);
        System.out.println(newDeck.get(newDeck.size() - 1));
        newDeck.remove(newDeck.size()-1);
        return lastCard;
    }


    public ArrayList<Card> createdDeck() {
        return new ArrayList<>(newDeck);
    }


}
