import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> newDeck = new ArrayList<>();

    public List<Card> getNewDeck() {
        return newDeck;
    }

    public void setNewDeck(List<Card> newDeck) {
        this.newDeck = new ArrayList<>();
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

    public ArrayList<Card> createdDeck() {
        return new ArrayList<>(newDeck);
    }


}
