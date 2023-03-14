package JavaProfessionalCourseHomeWork.HomeWork9_Set.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    /*
    Дан число k и ArrayList, содержащий целые числа. Необходим циклически сдвинуть числа в ArrayList вправо на k позиций.
    Например, 1 - 2 - 3 - 4 - 5 - 6 при k = 1 преобразуется в 6 - 1 - 2 - 3 - 4 - 5, а при k = 3 в 4 - 5 - 6 - 1 - 2 - 3.
     */

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6);
        int size = array.size();
        List<Integer> resultArray = new ArrayList<>();
        for (Integer i : array) {
            resultArray.add(i);
        }
        int k = 3;
        System.out.println(resultArray);
        for (int i = 0; i < size; i++) {
            array.set((i + k) % size, resultArray.get(i));
        }
        System.out.println(array);


    }
}
