package JavaProfessionalCourse.Lesson10_ComparingObjects_Comparator.RepeatHW9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Level2Task2 {
    public static void main(String[] args) {
        List<Integer> array = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> arrayListCopy = new ArrayList<>();


        int[] simpleArray = new int[]{1, 2, 3, 4, 6};
        int[] arrayCopy = new int[simpleArray.length];
        int k = 1;
        for (int i = 0; i < simpleArray.length - k; i++) {
            arrayCopy[i + k] = arrayCopy[i];
        }

        for (int i = simpleArray.length - k; i < k; i++) {
            arrayCopy[simpleArray.length - k + i] = arrayCopy[simpleArray.length - k + 1];
        }

        for (int i = 0; i < k; i++) {
            arrayListCopy.add(i, arrayListCopy.get(array.size() - k + i));
            arrayListCopy.add(array.get(array.size() - k + i));
        }

        Collections.swap(array, 1,3);
        Collections.rotate(array, 2);
        Collections.shuffle(array);
        List<Integer> unmodifableColl = Collections.unmodifiableList(arrayListCopy);



//        int i = 0;
//        boolean processed = false;
//        while (i != 0 || processed) {
//            int changePos = (i+k) % array.size();
//            int temp = array.get(changePos);
//            array.set(changePos, array.get(i));
//            i = changePos;
//        }
    }
}
