package book_ImproveJava._7_Encapsulation.ex1_BankAccount2.ex1_BankAccount;

import java.util.Date;

public class BankAccount {
    private double balance = 3500.00;

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                this.balance = balance - amount;
            } else {
                System.out.println("\nInsufficient balance");
            }
        } else {
            System.out.println("\nTransaction failed.");
        }
        System.out.printf("\nBalance is %.2f", balance);
        printCurrentDate();
    }

    public void printCurrentDate() {
        Date currentDate = new Date();
        System.out.println("\nTransaction date: " + currentDate);
    }

    public double getBalance() {
        return balance;
    }
}

