import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> newDeck;

    public List<Card> getNewDeck() {
        return newDeck;
    }

    public void setNewDeck(List<Card> newDeck) {
        this.newDeck = new ArrayList<>();
    }

    // METHODS -----------------------------
    public void createCardDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                newDeck.add(new Card(suit,rank));
            }
        }
    }

    // CONSTRUCTOR -------------------------
    public CardDeck(List<Card> newDeck) {
        setNewDeck(newDeck);
    }

    public ArrayList<Card> createdDeck() {
        return new ArrayList<>(newDeck);
    }


}
