package Algorithms.lesson3_Recurse.homework2;

import java.util.Scanner;

/*
Дано натуральное число N. Выведите слово YES, если число N
является точной степенью двойки, или слово NO в противном случае.
Операцией возведения в степень пользоваться нельзя!

 */
public class Level1Exercise1Variant2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int value = sc.nextInt();

        // вызов рекурсивной функции
        if (isPowerOfTwo(value) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static int isPowerOfTwo(int value) {
        // базовый случай
        if(value % 2 != 0) {
            return 0;
        } else if (value == 2) {
            return 1;
        }
        // вызов рекурсии
        return isPowerOfTwo(value / 2);
    }
}
