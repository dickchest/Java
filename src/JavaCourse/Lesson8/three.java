package JavaCourse.Lesson8;

import java.util.Random;

public class three {
    public static void main(String[] args) {
        String[] array = {"Alex", "Maria", "Thomas"};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // enhanced for loop
        // когда нас волнует не индекс массива,
        // когда необходимо последовательно перебирать элементы
        for (String x : array) {
            System.out.println(x);
        }

        int[] integers = {12, 34, 52, 3, 4, 3, 2};
        for (int x : integers) {
            System.out.println(x);
        }

        for (char c = 0; c < 256; c++) {
            System.out.printf("%s --- %d\n", c, (int) c);
            if (c == 64)
                break;

        }


        for (char c : "Iterate over me".toCharArray()) {
            System.out.println(c);
            /*
            Есть заданный массив символов.
            Строка состоящая из любых возможных комбинаций букв А, В, С
            Необходимо закодировать строку в другую строку, согласно таблице
            А ---- 1
            В -- 0
            С -- 3
            Вывести получившуюся строку на экран
            пример ВСАС -- 0313
            Сделать обратную ковертацию
            Пример: 0313 -- ВСФС
            Помочь в этом нам могут массивы String[] chars= {'a',}
            и int[] integers = {0,3,1,3}
            а также метод toCharArray(), который можно вызвать у строки.

         ==================================================
            Необходимо сгенерировать 50 случайных числе
            найти колво случ чисел, которые являются четными



             */
        }

        Random random = new Random();
        int x = 0;
        for (int i = 0; i < 50; i++) {
            int nextRandom = random.nextInt(0, 100);
            if (nextRandom % 2 == 0) {
                x++;
            }
        }
        System.out.println(x);
    }
}
