package JavaProfessionalCourse.Lesson6_Set_List_Queue.RepeatHomeWork5.Game;

import java.util.Scanner;

public class Game {

    private Deal dealer;

    public Game(Deal dealer) {
        this.dealer = dealer;
    }

    void start(int cardsForPlayer) {

        final int numberOfCards = dealer.getDeck().cards.length; // number of cards

        final Scanner sc = new Scanner(System.in);
        int players;

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        dealer.deal(players, cardsForPlayer);
    }

}
