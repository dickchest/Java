package JavaProfessionalCourseHomeWork.HomeWork9.Level2;

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
        List<Integer> resultArray = new ArrayList<>();
        int k = 1;
        int size = array.size();

        for (int i = 0; i < size; i++) {
//            resultArray.add(array.get(size + k) % size);
            System.out.println((i + k));

        }
        System.out.println(resultArray);


    }
}
