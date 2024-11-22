package book_ImproveJava.methods.varargsMethods.exercise2;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grossSalary, taxRate, netSalary;

        System.out.print("Enter a gross salary: ");
        grossSalary = scanner.nextDouble();

        System.out.print("Enter a taxerate: ");
        taxRate = scanner.nextDouble();

        netSalary = grossSalary - grossSalary * taxRate / 100;

        System.out.printf("The net saalry is: %.2f", netSalary);

    }
}
