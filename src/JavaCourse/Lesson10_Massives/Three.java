package JavaCourse.Lesson10_Massives;

import java.util.Random;

public class Three {
    public static void main(String[] args) {
        /*
        создать массив из 10 целочисленных значений
        каждое из этих значений должно быть случайным числом
        не являющимся > 100. вывести на экран
         */

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        for (int i : numbers) System.out.println(i);
    }
}
