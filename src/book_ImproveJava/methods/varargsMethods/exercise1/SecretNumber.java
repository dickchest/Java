package book_ImproveJava.methods.varargsMethods.exercise1;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        int secretNumber = 9;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a number: ");
            var answer = scanner.nextInt();

            if (answer == secretNumber) {
                System.out.println("Guess number is correct");
                break;
            }
            System.out.println("Guess is incorrect, try again");
        }
    }
}
