package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.2.34.  Сортировка троек.  Напишите программу, которая получает в аргументах
командной строки три целочисленных значения и выводит их упорядоченными по
возрастанию. Используйте методы Math. min () и Math. max().
 */
public class HomeWork1_2_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        int max = Math.max(x1, Math.max(x2, x3));
        int min = Math.min(x1, Math.min(x2, x3));
        int middle = x1 + x2 + x3 - max - min;
        System.out.printf("%d + %d + %d", max, middle, min);
    }

}
