package JavaProfessionalCourse.Lesson6.HomeWork6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        /*
        5. Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
        Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
        Замерьте время, которое потрачено на это. Сравните результаты и предположите,
        почему они именно такие.

        Как замерить время:
    long before = System.currentTimeMillis();
    //здесь написать код выполнения
	long after = System.currentTimeMillis();
	System.out.println(after - before);
         */


        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        // элементы в АrrayList
        long before = System.currentTimeMillis();
        arrayList = addElementsToList(arrayList);
        long after = System.currentTimeMillis();
        System.out.println("ArrayList: "+ (after - before));

        // элементы в LinkedList
        before = System.currentTimeMillis();
        linkedList = addElementsToList(linkedList);
        after = System.currentTimeMillis();
        System.out.println("linkedList: "+ (after - before));



        // выбираем элементы в АrrayListe
        before = System.currentTimeMillis();
        chooseElementRandomly(arrayList);
        after = System.currentTimeMillis();
        System.out.println("ArrayList: "+ (after - before));

        // выбираем элементы в LinkedListe
        before = System.currentTimeMillis();
        chooseElementRandomly(linkedList);
        after = System.currentTimeMillis();
        System.out.println("linkedList: "+ (after - before));


    }
    public static List addElementsToList(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void chooseElementRandomly(List<Integer> list) {
        Random random = new Random();
        int getResult;
        for (int i = 0; i < 100_000; i++) {
            getResult = list.get(random.nextInt(1000000));
        }
    }
}
