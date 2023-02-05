package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.3.1.  Напишите программу, которая получает три целых числа как аргументы
командной строки и выводит сообщение  " e q u a l" ,  если все три числа равны, или
"n o t e q u a l"   в противном случае.
 */
public class HomeWork1_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        if (a1 == a2 && a3 == a1) System.out.println("equel");
        else System.out.println("not equal");
     }
}
