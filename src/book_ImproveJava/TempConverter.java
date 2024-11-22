package book_ImproveJava;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n... Input...");
        System.out.println("Enter a degree in Fahrenheit");
        double tempFahrenheit = input.nextDouble();
        double tempCelsius = (tempFahrenheit - 32) *5 / 9;

        System.out.println("\n... Output...");
        System.out.println(tempFahrenheit + "Fahrenheit = " + tempCelsius + "Celsius");
    }
}
