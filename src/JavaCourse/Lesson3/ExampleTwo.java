package JavaCourse.Lesson3;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int yearOfBirth = 2022 - age;
        System.out.println("You was born at " + yearOfBirth);
        System.out.println("Please enter radius");
        double radius = scanner.nextDouble();
        double squareOfCircle = Math.PI*radius*radius;
        System.out.println("Square of circle = " + squareOfCircle);
    }
}
