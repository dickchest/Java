package BookComputerScience;

import java.util.Scanner;

// Преобразование типа для получения случайного числа
public class Listing1_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        System.out.println(r);
        int value = (int) (r*n);
        System.out.println(value);
        System.out.println(Math.round(6.022e23));
    }
}
