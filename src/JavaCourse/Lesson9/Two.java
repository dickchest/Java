package JavaCourse.Lesson9;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Введите a");
        int a = reader.nextInt();
        System.out.println("Введите b");
        int b = reader.nextInt();
        System.out.println("Введите c");
        int c = reader.nextInt();

        while (a%b !=0) {
            a += c;
            System.out.println(a + ";");
        }
    }
}
