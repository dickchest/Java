package JavaProfessionalCourse.Lesson5;

import JavaProfessionalCourseHomeWork.HomeWork2.Level2.Exercise3.CreditCard;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = {1,2,3,4, 5,12,34};
        String[] str = new String[10];
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(arr));

        int[] newArrays = Arrays.copyOf(arr2, 3);
        int[] newArrays2 = Arrays.copyOfRange(arr2, 3, 5);
        int[] newArrays3 = Arrays.copyOfRange(arr2, 3, 5);

        System.out.println(Arrays.toString(newArrays));
        System.out.println(Arrays.toString(newArrays2));



        Object[] objects = new Object[4];
        objects[0] = "sdklfjdkl";
        objects[1] = 76; // autoboxing Integer(76)
        objects[2] = new CreditCard("234", 3735);
        objects[3] = arr;
        System.out.println(Arrays.toString(objects));


        // многомерные массивы
        int[][] arr1 = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            int[] array = arr1[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = i*j;
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

    }
}
