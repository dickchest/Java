package BookComputerScience.HomeWork;

import java.util.Scanner;

public class HomeWork1_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a % b == 0);
/*
1.2.15.  Напишите программу, которая получает три положительных числа в ар­
гументах командной строки и выводит f a ls e ,  если одно из них больше или равно
сумме других, или t r u e   в противном случае. (Примечание: программа проверяет,
могут ли числа представлять длины сторон некоторого треугольника.)
 */
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        System.out.println(a1 >= (a2 + a3) || a2 >= (a1+a3) || a3 >= (a1+a2));
    }
}
