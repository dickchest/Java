package StartBasicLessons;

import java.util.Scanner;

public class Lesson15If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        Integer value = scanner.nextInt();
        if (value < 0) {
            System.out.println("отрицательное");
        } else if (value > 0) {
            System.out.println("положительное");
        } else {
            System.out.println("ноль");
        }

        System.out.println("Введите год");
        value = scanner.nextInt();
        if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год  не высокосный");
        }
    }
}
