public class Card {
    private  Suit suit;
    private  Ranks rank;
    private  Joker joker;


    // GETTERS -------------
    public Suit getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public Joker getJoker() {
        return joker;
    }

    // Constructor ---------
    public Card(CardDeck.) {
        this.joker = joker;
    }

    public Card(Suit suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Methods -------------


    @Override
    public String toString() {
        if (this.joker == Joker.JOKER) {
            return "Card is " + joker;
        } else {
            return "Card is " + rank + " of " + suit;
        }

    }
}
