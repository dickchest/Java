package JavaProfessionalCourseHomeWork.HomeWork7;

import java.util.Iterator;

public class Exercise5 {
    public static void main(String[] args) {
        /*
        5. Напишите свой итератор для перебора элементов в массиве. Проверьте работу используя вызов итератора
         */

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        MyOwnIterator myOwnIterator = new MyOwnIterator(array);

        while (myOwnIterator.hasNext()) {
            System.out.println(myOwnIterator.next());
        }
    }
}
