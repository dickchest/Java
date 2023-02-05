package JavaProfessionalCourse.Lesson6.HomeWork6;

import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {

        /*
        6. Попробуйте реализовать алгоритм бинарного поиска описанного на последнем слайде
         */
        int[] array = new int[10];

        int start = 0;
        int end = array.length - 1;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, num, start, end));

    }

    public static int binarySearch(int[] array, int num, int start, int end) {
        int returnBinarySearch = -1;
        while (returnBinarySearch == -1) {
            int middle = (end - start) / 2 + start;
            System.out.println(middle);
            if (num > array[middle]) {
                start = middle + 1;
            } else if (num < array[middle]) {
                end = middle - 1;
            } else {
                returnBinarySearch = middle;
            }
        }
        return returnBinarySearch;
    }

}
