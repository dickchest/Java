package Algorithms.lesson3_Recurse.homework2;

import java.util.Scanner;

/*
Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки,
массивы (ну и циклы, разумеется).
 */
public class Level1Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int value = sc.nextInt();

        // вызов рекурсивной функции
        System.out.println(sumOfDigits(value));
    }

    private static int sumOfDigits(int value) {
        // базовая фукнция
        if (value < 10) {
            return value;
        }
        // вызов рекурсии
        return value % 10 + sumOfDigits(value / 10);
    }

}
