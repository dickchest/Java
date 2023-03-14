package JavaProfessionalCourseHomeWork.HomeWork16.Level2;

/*
1. Напишите метод нахождения максимального значения для:

Любого листа (он должен быть generic)- параметры лист и компаратор
Листа элементов (элементы должны быть наследниками компарабл) - параметры лист
Любой коллекции (он должен быть generic)- параметры коллекция и компаратор
Коллекции элементов (элементы должны быть наследниками компарабл) - параметры коллекция
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        // Любого листа (он должен быть generic)- параметры лист и компаратор
        List<Integer> list = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = new IntegerComparator();
        System.out.println(MyMath.getMax(list, comparator));

        //Листа элементов (элементы должны быть наследниками компарабл) - параметры лист
        List<Integer> list1 = Arrays.asList(1, 3, 2);
        System.out.println(MyMath.getMax(list1));

        // Любой коллекции (он должен быть generic)- параметры коллекция и компаратор
        Collection<String> collection1= Arrays.asList("a", "C", "d", "mama");
        Comparator<String> comparator1 = new StringComparator();
        System.out.println(MyMath.getMax(collection1, comparator1));

        // Коллекции элементов (элементы должны быть наследниками компарабл) - параметры коллекция
        Collection<String> collection2= Arrays.asList("a", "C", "d", "mama");
        System.out.println(MyMath.getMax(collection2));

    }
}
