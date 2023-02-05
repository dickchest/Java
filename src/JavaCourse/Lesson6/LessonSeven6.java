package JavaCourse.Lesson6;

import java.util.Scanner;

public class LessonSeven6 {
    public static void main(String[] args) {
        /*
        в консоли вводится некоторое трехзначное число.
        Нам необходимо найти наибольшую цифру этого числа
         */

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 10; // 195 --- 5
        int c = (a/10) % 10; // 19.5 % 10 --- 9
        int d = a / 100;

        // как найти наибольшую цифру этого числа

        boolean isB = (b>c) && (b > d);
        boolean isC = (c>b) && (c > d);
        boolean isD = (d>c) && (d > b);

        if (isB) {
            System.out.println(b);
        }
        if (isC) {
            System.out.println(c);
        }
        if (isD) {
            System.out.println(d);
        }
        /// TODO: 31.10.2022

    }
}
