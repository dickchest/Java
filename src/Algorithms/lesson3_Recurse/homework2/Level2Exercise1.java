package Algorithms.lesson3_Recurse.homework2;

import java.util.Scanner;

/*
Напишите рекурсивный метод, который выводит
на экран числа Фибоначчи до N-ого элемента
 */
public class Level2Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int value = sc.nextInt();

        // вызов рекурсивной функции

    }

    private static int fibonacci(int number, int sum, int current) {
        // базовая фукнция
        if (number == 0) {
            return sum;
        }
        
        // вызов рекурсии
//        return sum + fibonacci(number-=, current);
        return 0; // просто заглушка пока
    }

}
