package JavaProfessionalCourseHomeWork.HomeWork8.List;


import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Rustam Khakov
 */
public class MyListTest {
    public static void main(String[] args) {
        List<Integer> values = new MyList();
        values.add(8);
        values.add(5);
        System.out.println(values.size());
        System.out.println(values.get(0));
        System.out.println(values.get(1));
        System.out.println(values.set(0, 7));
        System.out.println(values.get(0));
        values.add(0, 6);
        System.out.println("After insert");
        System.out.println(values.get(0));
        System.out.println(values.get(1));
        System.out.println(values.get(2));
        values.remove(0);
        System.out.println(values.get(1));

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        show(values);
        System.out.println(values.get(3));

        // descendingIterator() = не находит такого метода. Не могу понять по какой причине
//        Iterator<Integer> iterator = values.descendingIterator();

        System.out.println("---   ListIterator   ---");
        ListIterator<Integer> iterator = values.listIterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            i++;
            if (i==4) {
                System.out.println(iterator.previous());
            }
        }

        System.out.println("---   toArray   ---");

        Integer[] array = (Integer[]) values.toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("---   containsAll   ---");
        List<Integer> elementsToSearchFor = List.of(3,1,2);
        System.out.println(values.containsAll(elementsToSearchFor));

        elementsToSearchFor = List.of(3,1,2, 6);
        System.out.println(values.containsAll(elementsToSearchFor));

        System.out.println("---   removeAll(Collection<?> c)   ---");
        elementsToSearchFor = List.of(1, 9);
        System.out.println(values.removeAll(elementsToSearchFor));
        show(values);

        System.out.println("---   lastIndexOf(Object o)   ---");
        System.out.println(values.lastIndexOf(1));
        System.out.println(values.lastIndexOf(7));
        values.add(7);
        System.out.println(values.lastIndexOf(7));
        show(values);


        System.out.println("---   subList   ---");
        List<Integer> subList = values.subList(2, 4);
        show(subList);

        System.out.println("---   addAll   ---");
        values.addAll(5, subList);
        show(values);

        System.out.println("---   retainAll(Collection<?> c)   ---");
        values.retainAll(subList);
        show(values);


    }

    private static void show(List<Integer> values) {
        for (Integer item : values) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
