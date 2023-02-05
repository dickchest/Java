package BookComputerScience.HomeWork;
/*
1.2.21.  Напишите программу, которая получает число t  в аргументе командной
строки и выводит значение sin(2£) + sin(3£).
 */
import java.util.Scanner;

public class HomeWork1_2_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.sin(2*t) + Math.cos(3*t));
    }
}
