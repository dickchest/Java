package JavaCourse.Lesson8;

import java.util.Random;

public class oneFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i < 10);
        }

        // напишите программу выводящую 100 числе
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }

        // сделать программу, вычисляюющую 25 раз случайные числа и проверяя их с предыдущими
        Random random = new Random();

        int previousInteger = 0;
        for (int i = 0; i < 25; i++) {
            int randomInteger = random.nextInt(0, 100);

            System.out.printf("previousInteger = %d, currentInteger = %d\n", previousInteger, randomInteger);
            if (randomInteger > previousInteger) {
                System.out.println("больше");
            } else if (randomInteger < previousInteger) {
                System.out.println("меньше");
            } else {
                System.out.println("равно");
            }

            previousInteger = randomInteger;
            //System.out.println(randomInteger);
        }

        // запись без фигурных скобок
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World");

        int sum = 0;
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);

        // мы можем в блоке инициализации не одну, а несколько, но они
        // должны быть одного типа
        int x = 2;
        for (long y = 0, z = 4; (x < 10) && (y < 10); x++, y = y + 2) {
            //System.out.println(y + " ");
            System.out.printf("x = %d, y = %d\n", x, y);
        }
        System.out.println(x);

        int i = 1024;
        int delimiter = 2;
        for (; i >= 1; i = i / delimiter) {
            System.out.println(i);
            //System.out.println(delimiter);
        }


        for (int x1 = 0, y = 1, z = 2; x1 > 0 && z >= -123 || y < 10; y++, z = z * 2) {
            System.out.printf("x = %d, y = %d, z = %d\n", x1, y, z);
        }

    }
}
