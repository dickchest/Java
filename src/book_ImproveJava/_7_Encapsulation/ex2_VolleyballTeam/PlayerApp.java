package book_ImproveJava._7_Encapsulation.ex2_VolleyballTeam;

import java.util.Scanner;

public class PlayerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = input.nextLine();

        System.out.print("Enter the age:");
        int age = input.nextInt();

        System.out.print("Enter the height in cm:");
        double height = input.nextDouble();

        System.out.print("Enter years of experience:");
        int experience = input.nextInt();

        // direct access
        Player player = new Player(name, age, height, experience);
        System.out.println("\n---Player Info---");
        player.printAll();
        System.out.println("\n---Result---");
        player.getResult();
    }
}
