package JavaProfessionalCourse.Lesson5_Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,7,5,9,7,8,3,2,5,0};
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(200);
        }

        // 10 -> 55
        // 100 -> 5050 // x100
        // 1000 -> 500500// x100
        // квадратичная сложность - увеличение в квадрате
        // сортировка выборкой
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // 10
            int max = array[0];
            int maxIndex = 0;
            for (int j = 0; j < array.length-i; j++) { // 10 9 8 7 6 5 4 3 2 1 раз
                if(array[j] > max) {
                    maxIndex = j;
                    max = array[j];
                }
                sum++;
            }
            // swap
            int tmp = array[array.length-i-1];
            array[array.length-i-1] = max;
            array[maxIndex] = tmp;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);


        Arrays.sort(array);
    }
}
