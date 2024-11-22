package book_ImproveJava;

import java.util.Scanner;

public class SumOfEnteredNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int value;
        Scanner scanner = new Scanner(System.in);

        do {
            value = scanner.nextInt();
            sum += value;
            System.out.println("Entered number = " + value);
        } while (sum < 100);
        System.out.println("----------------");
        System.out.println("Sum = " + sum);
    }
}
