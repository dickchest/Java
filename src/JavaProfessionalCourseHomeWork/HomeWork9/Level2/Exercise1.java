package JavaProfessionalCourseHomeWork.HomeWork9.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {
    /*
    Задача состоит в том, чтобы удалить повторяющиеся элементы в ArrayList.
Примеры:

Input: ArrayList = [1, 2, 2, 3, 4, 4, 4]
Output: [1, 2, 3, 4]

Input: ArrayList = [12, 23, 23, 34, 45, 45, 45, 45, 57, 67, 89]
Output: [12, 23, 34, 45, 57, 67, 89]
     */

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 2, 3, 4, 4, 4);
        List<Integer> outputList = new ArrayList<>();

        Integer lastElement = null;
        for (Integer currentElement : inputList) {
            if (!currentElement.equals(lastElement)) {
                outputList.add(currentElement);
            }
            lastElement = currentElement;
        }

        System.out.println(outputList);
    }
}
