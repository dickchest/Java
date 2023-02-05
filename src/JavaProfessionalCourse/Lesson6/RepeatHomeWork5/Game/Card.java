package JavaProfessionalCourse.Lesson6.RepeatHomeWork5.Game;

public final class Card {
    private final Rank rank;
    private final Suits suit;

    public Card(Rank rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}
