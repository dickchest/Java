package BookComputerScience;

import java.util.Scanner;

public class Listing1_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double b = Double.parseDouble(args[0]);
//        double c = Double.parseDouble(args[1]);
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);
    }
}
