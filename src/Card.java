public class Card {
    private final Suit suit;
    private final Rank rank;


    // GETTERS -------------
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // Constructor ---------
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Methods -------------


    @Override
    public String toString() {
        if (this.rank == Rank.JOKER) {
            return "Card is a JOKER";
        } else {
            return "Card is " + rank + " of " + suit;
        }
    }
}
