package JavaCourse.Lesson9;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringLine;
        System.out.println("Enter line:");
        stringLine = scanner.nextLine();
        String[] words = stringLine.split(" ");

        for(String i : words) {
            System.out.println(i);
        }
    }
}
