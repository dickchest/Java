package JavaProfessionalCourseHomeWork.HomeWork9.Level2;

import java.util.*;

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

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(inputList);
        System.out.println(treeSet);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(inputList);
        System.out.println(hashSet);
    }
}
