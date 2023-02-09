package JavaProfessionalCourseHomeWork.HomeWork7.Level2;

import java.util.Arrays;
import java.util.Random;

public class Exercise1Test {
    public static void main(String[] args) {

        int Row = 20;
        int Column = 10;
        int[][] array = new int[Column][Row];

        System.out.println(array[0].length);
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        DoubleArrayIterator doubleArrayIterator = new DoubleArrayIterator(array);

        while (doubleArrayIterator.hasNext()) {
            System.out.println(doubleArrayIterator.next());
        }
    }
}
