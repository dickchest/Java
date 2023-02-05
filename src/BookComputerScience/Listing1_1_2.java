package BookComputerScience;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Listing1_1_2 {
    public static void main(String @NotNull [] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        System.out.print("Hi, ");
        System.out.print(enter);
        System.out.println(". How are you?");
    }
}
