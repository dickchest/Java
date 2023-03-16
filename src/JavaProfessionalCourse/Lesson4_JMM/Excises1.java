package JavaProfessionalCourse.Lesson4_JMM;

import java.util.Arrays;

public class Excises1 {
    public static void main(String[] args) {
        int i; // есть 0. -1
        short s;
        long l;
        Integer integer; // есть дополнитлеьное состояние Null
        Short sh;
        Long lo;
        Byte by;
        Boolean bo;

        int[] values = new int[10];
        Integer[] valuse2 = new Integer[10];
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(valuse2));

        System.out.println(values.toString());
        i = 0;
        Integer integer1 = i; // autoboxing
        int val = integer1; // unboxing

        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

//        final int i = 5;
        final String[] list = new String[4];

        

    }
}
