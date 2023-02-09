package JavaProfessionalCourseHomeWork.HomeWork7.Level2.Exercise2;

import JavaProfessionalCourseHomeWork.HomeWork4.Escercise2_1.DeckOfCards;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        LoopedIterator iterator = new LoopedIterator(deck);
        int i = 0;
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
