package JavaProfessionalCourse.Lesson6;

import JavaProfessionalCourseHomeWork.HomeWork2.Level2.Exercise3.CreditCard;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        List list = new ArrayList(10); // Object[] array = new int[10]
        list.add("eye");
        list.add(5);
        list.add(new CreditCard("dfs", 1234));

        // дженерики используется для задания типов данных листам
        List<String> list1 = new ArrayList<>(); // diamond operation, размер можно не писать
        list1.add("5");
        list1.add("asdlkfjdkljf");
        list1.remove(0);
        list1.add("test2");

        System.out.println(list1.size());
        System.out.println(list1);

        list1.set(0, "new test");
        System.out.println(list1);

        // iteration
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        list1.add(0, "First element");
        System.out.println(list1);

        list1.add(1, "2nd element");
        System.out.println(list1);

        list1.add(4, "last element");
        System.out.println(list1);



        List<String> toChange = List.of("first", "second", "third", "fourth");
        for (int i = 0; i < list1.size(); i++) {
            if (toChange.size() > i) {
                list1.set(i, toChange.get(i));
            }
        }
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
                list1.set(i, "test");
        }
        System.out.println(list1);

        list1.removeIf(val-> val.length() > 3);


        List removedList = new ArrayList(list1); // это коротко то, что ниже
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() > 2) {
//                list1.remove(list1.get(i));
                removedList.remove(list1.get(i)); // не надо делать list1.remove(i)
            }
        }
        System.out.println(removedList);
        int count = 0;
        list1.add("test2");
        list1.add("A");
        list1.add("Ab");
        list1.add("ABC");

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals("test2")) {
                count++;
            }
        }

        // СОРТИРОВКА
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        int[] arrayTest = new int[10];
        /*
        заполнен
        отсортирован
        бинарный поиск
        binarySearch(array, num, 0,10);
        array[5] если он больше, чем то, что там лежит, то запускаем метод бинари сеарч от 5-10
        если равно, то возвращаем что нашли
        если меньше то запускаем поиск на левой половине (0, 5);
         */

    }
}
