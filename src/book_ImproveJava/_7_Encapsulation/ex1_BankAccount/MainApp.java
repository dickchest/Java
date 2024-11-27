package book_ImproveJava._7_Encapsulation.ex1_BankAccount;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        double balance = bankAccount.getBalance();
        System.out.printf("Balance is: %.2f", balance);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a positive amount: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            if (balance - amount >= 0) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
            System.out.printf("Balance is: %.2f", balance);
            scanner.close();
        } else {
            System.out.println("Transaction failed.");
        }
    }
}
