package JavaProfessionalCourseHomeWork.HomeWork9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Даны два LinkedList, содержаших целые числа. Числа в них расположены в возрастающем порядке.
Необходимо получить третий LinkedList, являющийся объединением первых двух, причем числа в нем тоже
должны быть расположены в возрастающем порядке. Например, из списков 1 - 2 - 4 и 1 - 3 - 4
должен получиться 1 - 1 - 2 - 3 - 4 - 4.
 */
public class Exercise6 {
    public static void main(String[] args) {
        // initialization of the lists
        List<Integer> listOne = List.of(1, 2);
        List<Integer> listTwo = List.of(1, 4, 6, 7, 9);
        List<Integer> listResult = new LinkedList<>();

        // initialization of the Iterators
        Iterator<Integer> listOneIterator = listOne.listIterator();
        Iterator<Integer> listTwoIterator = listTwo.listIterator();

        Integer currentOne = getNext(listOneIterator);
        Integer currentTwo = getNext(listTwoIterator);

        // iteration through the first list
        while (currentOne != null || currentTwo != null) {
            if (currentOne == null) {
                System.out.println("1 is null");
                listResult.add(currentTwo);
                currentTwo = getNext(listTwoIterator);
                continue;
            }

            if (currentTwo == null) {
                System.out.println("2 is null");
                listResult.add(currentOne);
                currentOne = getNext(listOneIterator);
                continue;
            }
            // проверка условий, пока оба листа не закончились
            if (currentOne < currentTwo) {
                listResult.add(currentOne);
                currentOne = getNext(listOneIterator);
            } else {
                listResult.add(currentTwo);
                currentTwo = getNext(listTwoIterator);
            }
        }

        // printing the result
        System.out.println(listResult);
    }

    public static Integer getNext(Iterator<Integer> iterator) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }
}
