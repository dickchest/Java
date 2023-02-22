package JavaProfessionalCourse.Lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayKTimesElem {
    public static void main(String[] args) {
        // первый элемент.встречающийся к раз в массиве
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(ThreadLocalRandom.current().nextInt(100));
        }
        Map<Integer, Integer> howManytimesEnered = new HashMap<>();

        int k = 3;
        for (int i = 0; i < list.size(); i++) {
            Integer val = howManytimesEnered.get(list.get(i));
            if (val == null) {
                howManytimesEnered.put(list.get(i), 1);
            } else {
                howManytimesEnered.put(list.get(i), val + 1);
            }
        }
        for (Integer keys : howManytimesEnered.keySet()) {
            if (k == howManytimesEnered.get(keys)) {
                System.out.println(keys);
                return;
            }
        }
    }
}
