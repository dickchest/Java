package book_ImproveJava.hashMap.ex2_AddDischesToTheMenu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDishes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Current menu: "+ menu.display());
        System.out.print("Add a dish to the menu:");
        String dish = scanner.nextLine();

        if (menu.dishes.contains(dish)) {
            System.out.println(dish + " is already on the menu.");
        } else {
            menu.dishes.add(dish);
            System.out.println("Add a dish to the menu: " + dish);
            System.out.println(dish + " is added: " + menu.display());
        }
    }
}
