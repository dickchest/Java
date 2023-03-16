package JavaProfessionalCourse.Lesson6_Set_List_Queue.RepeatHomeWork5.Game;

public class Deal {

    private Deck deck;


    public Deal(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }
    public void deal(int players, int cardsForPlayer) {

        Card[] cards = deck.getCards();
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cards[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }

    public static void main(String[] args) {

        final int cardsForPlayer = 5;

        // deck initialization
        Deck deck = new Deck();

        // deck shuffling
        deck.shuffle();

        // the shuffled deck is displayed
        Deal dealer = new Deal(deck);

        Game game = new Game(dealer);
        game.start(deck.cards.length);

    }
}
