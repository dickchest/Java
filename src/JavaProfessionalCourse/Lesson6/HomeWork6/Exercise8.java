package JavaProfessionalCourse.Lesson6.HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {

        /*
        8. Напишите метод sort который будет сортировать List методом пузырька
         */
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // заполняем лист случайными элементами
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
//            list.add(100 - i);
        }
        System.out.println(list);
        // производим сортировку
        list = sort(list);
        System.out.println(list);


    }

    public static List<Integer> sort(List<Integer> list) {
        int x = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                    x++;
                }
            }
        }
        System.out.println(x);
        return list;
    }
}

