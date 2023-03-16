package JavaProfessionalCourse.Lesson6_Set_List_Queue.RepeatHomeWork5.Game;

import java.util.Random;

public class Deck {
    Card[] cards;

    public Deck() {
        Rank[] rank = Rank.values();
        Suits[] suits = Suits.values();
        int numberOfCards = rank.length * suits.length;
        cards = new Card[numberOfCards];

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[suits.length * i + j] = new Card(rank[i], suits[j]);
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int card = i + (random.nextInt(cards.length - i)); // random card in the deck
            Card temp = cards[card];
            cards[card] = cards[i];
            cards[i] = temp;
        }
    }


}
