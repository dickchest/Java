package BookComputerScience.HomeWork;

import java.util.Scanner;
import java.util.Stack;

/*
1.2.19. Напишите программу, которая получает два целых числа а и b в аргументах
командной строки и выводит случайное целое число из диапазона от а до b вклю­
чительно.
 */
public class HomeWork1_2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double r = Math.random();
        System.out.println((int) (r*(b-a+1) + a));
    }
}
