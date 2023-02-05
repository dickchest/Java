package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.2.23. Напишите программу, которая получает два целых числа m и d в аргументах
командной строки и выводит true, если день d месяца m лежит в диапазоне от 20/03
до 20/06, или false в противном случае.
 */
public class HomeWork1_2_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isSpring = (m==3) && d >=20 && d <=31
                        || (m==4) && d >=1 && d <=30
                        || (m==5) && d >=1 && d <=31
                        || (m==6) && d >=1 && d <=20;

        System.out.println(isSpring);
    }
}
