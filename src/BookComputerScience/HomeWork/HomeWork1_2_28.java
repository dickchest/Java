package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.2.28. Проверка упорядоченности. Напишите программу, которая получает три
числа типа double х, у и z в аргументах командной строки и выводит true, если
значения расположены  строго по возрастанию  или убыванию  ( х < у < z или
х>  у>  z ), или false в противном случае.
 */
public class HomeWork1_2_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,z;
        while(1<5) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            z = scanner.nextDouble();
            System.out.println((x<y && y<z) || (x>y && y>z));
        }
    }
}
