package JavaCourse.Lesson10_Massives;

import java.util.Arrays;
import java.util.Random;

public class FourCloneCopytoString {
    public static void main(String[] args) {
        Integer[] ints = new Integer[5];
        ints[0] = 1;
        Integer[] int2 = ints;
        ints[0] = 2;
        // ints & int2 ссылкаются на одни и теже ячейки памяти

        Integer[] ints3 = ints.clone(); // 2 разных массива

        //copyOf() начинает копирование с 0 го индекса масссва

        int[] ints4 = new int[10];
        for (int i = 0; i < ints4.length; i++) {
            ints4[i] = i;
        }
        for(int i : ints4) System.out.println(ints4[i]);

        int[] arrayCopy = Arrays.copyOf(ints4, 4);

        // копирование диапазона
        int[] arrayCopy1 = Arrays.copyOfRange( ints4,2,7);


        // toString() возвращает строковое выражение содержимого массива
        String s = Arrays.toString(ints4);
        System.out.println(s);

        for (int i : arrayCopy) System.out.println(arrayCopy1[i]);

        // Arrays.sort - сортирует массив в порядке возрастания

        Random r = new Random();
        int[] randomInts = new int[10];

        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = r.nextInt(101);
            System.out.println(randomInts[i]);
        }

        System.out.println(Arrays.toString(randomInts));
        Arrays.sort(randomInts, 2, 7);
        System.out.println(Arrays.toString(randomInts));

//        for (int i = 0; i < int2.length; i++) {
//            System.out.println(int2[i]);
//        }

    }
}
