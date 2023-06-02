package Algorithms.lesson3_Recurse.homework2;

import java.util.Scanner;

/*
Дано натуральное число N. Выведите слово YES, если число N
является точной степенью двойки, или слово NO в противном случае.
Операцией возведения в степень пользоваться нельзя!

 */
public class Level1Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int value = sc.nextInt();

        // вызов рекурсивной функции
        if (isPowerOfTwo(value, 2) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static int isPowerOfTwo(int value, int count) {
        // базовый случай
            if(value == count) {
                return 1;
            } else if (value < count) {
                return 0;
            }
            // вызов рекурсии
            return isPowerOfTwo(value,count*2);
    }
}
