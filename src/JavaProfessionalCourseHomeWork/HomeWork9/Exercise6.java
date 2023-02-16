package JavaProfessionalCourseHomeWork.HomeWork9;

import org.w3c.dom.ls.LSOutput;

import java.net.Inet4Address;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Даны два LinkedList, содержаших целые числа. Числа в них расположены в возрастающем порядке.
Необходимо получить третий LinkedList, являющийся объединением первых двух, причем числа в нем тоже
должны быть расположены в возрастающем порядке. Например, из списков 1 - 2 - 4 и 1 - 3 - 4
должен получиться 1 - 1 - 2 - 3 - 4 - 4.
 */
public class Exercise6 {
    public static void main(String[] args) {
        // initialization of the lists
        List<Integer> listOne = List.of(1, 2, 4);
        List<Integer> listTwo = List.of(1, 3, 4, 7, 9);
        List<Integer> listResult = new LinkedList<>();

        // initialization of the Iterators
        Iterator<Integer> listOneIterator = listOne.listIterator();
        Iterator<Integer> listTwoIterator = listTwo.listIterator();

        // iteration through the first list
        while (listOneIterator.hasNext()) {
            Integer currentItemFromListOne;
            Integer currentItemFromListTwo;
            currentItemFromListOne = listOneIterator.next();

            if (listTwoIterator.hasNext()) {
                currentItemFromListTwo = listTwoIterator.next();
                if (currentItemFromListOne>currentItemFromListTwo) {
                    listResult.add(currentItemFromListTwo);
                    listResult.add(currentItemFromListOne);
                } else {
                    listResult.add(currentItemFromListOne);
                    listResult.add(currentItemFromListTwo);
                }
            } else {
                listResult.add(currentItemFromListOne);
            }
        }

        // checking, if second list has more elements
        if (listTwoIterator.hasNext()) {
            while (listTwoIterator.hasNext()) {
                listResult.add(listTwoIterator.next());
            }
        }

        // printing the result
        System.out.println(listResult);
    }
}
