package JavaProfessionalCourseHomeWork.HomeWork12.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/*
7. Дан лист из 1000 чисел (заполните его рандомом), необходимо найти дубликаты
 */
public class Exercise7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(ThreadLocalRandom.current().nextInt(100));
        }
        System.out.println(list);

        System.out.println("Находим дубликаты и выводим их на экран");
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (Integer x : list) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) +1);
            if (hashMap.get(x) > 1)
                System.out.println(x + " : " + hashMap.get(x));
        }
    }
}
