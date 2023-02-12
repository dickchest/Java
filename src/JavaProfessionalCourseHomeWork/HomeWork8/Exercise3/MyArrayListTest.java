package JavaProfessionalCourseHomeWork.HomeWork8.Exercise3;

import java.util.Iterator;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList array = new MyArrayList();
        System.out.println(array.isEmpty());
        array.set(0, 5);
        array.add(1);
        array.add(2);
        System.out.println(array);
        System.out.println(array.size());
        System.out.println("------------------");
        array.set(1, 3);
        System.out.println(array);

        System.out.println(array.size());
        System.out.println(array.isEmpty());
        System.out.println("while has next");
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("for each");
        for (Integer i : array) {
            System.out.println(i);
        }
        System.out.println("---- get ----");
        System.out.println(array.get(1));

        System.out.println("---- contains ----");
        System.out.println(array.contains(1));
        System.out.println(array.contains(2));

        System.out.println("---- remove ----");
        array.add(9);
        array.remove(1);
        System.out.println(array);
        array.remove(0);
        System.out.println(array);

        System.out.println("---- remove(Object o) ----");
        array.add(1);
        array.add(2);
        System.out.println(array);
        Integer x = 9;
        System.out.println(array.remove(x));
        System.out.println(array);
        x = 0;
        System.out.println(array.remove(x));
        System.out.println(array);

        System.out.println("---- add(int index, Integer value) ----");
        array.add(0,8);
        System.out.println(array);

        System.out.println("---- indexOf(Object o) ----");
        System.out.println(array.indexOf(8));
        System.out.println(array.indexOf(1));
        System.out.println(array.indexOf(9));

        System.out.println("---- lastIndexOf(Object o) ----");
        array.add(1);
        System.out.println();
        System.out.println(array.lastIndexOf(1));

        System.out.println("---- subList(int fromIndex, int toIndex) ----");
        List<Integer> list = array.subList(1,2);
        System.out.println(list);


    }
}
