package JavaProfessionalCourse.Lesson7.RepeatHomeWork6Iterators;

import java.util.Arrays;
import java.util.Random;

public class HQ6BinarySearch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array);
        binarySearch(array, 8);


    }

    static int binarySearch(int[] array, int number) {
        int length = array.length;
        // рекурсия - очень странная штука
        // рекурсия -вызов метоад самого себя
//        лучше не писать рекурсивные алгоритмы, тк. это может быть причиной переполнения стека


        int from = 0;
        int to = array.length;


        while (from - to >= 0) {


            int middle = (to - from) / 2;

            if (number == array[middle]) {
                return middle;
            }
            if (number > array[middle]) {

                from = middle;

//            from right
            } else {
                to = middle;
//            from left
            }

        }
            return -1;
    }
}
