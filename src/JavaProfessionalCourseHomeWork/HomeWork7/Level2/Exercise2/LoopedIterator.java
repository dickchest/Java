package JavaProfessionalCourseHomeWork.HomeWork7.Level2.Exercise2;

import JavaProfessionalCourseHomeWork.HomeWork4.Escercise2_1.DeckOfCards;

import java.util.Iterator;

public class LoopedIterator implements Iterator<String> {
    private DeckOfCards deck;
    private int numberOfCards;
    private int currentCard = -1;

    public LoopedIterator(DeckOfCards deck) {
        deck.initialization();
        deck.shuffling();
        this.deck = deck;
        numberOfCards = deck.getNumberOfCards();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        if (currentCard == numberOfCards - 1) {
            currentCard = -1;
            deck.shuffling();
            System.out.println("-------    deck is over    --------------");
        }
        currentCard++;
        return deck.getDeck()[currentCard];
    }
}
