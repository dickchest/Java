package JavaProfessionalCourseHomeWork.HomeWork19.Level1;
/*
13. С помощью рандома сгенерируйте 100 чисел (от 0 до 50), в полученном списке отфильтруйте все,
которые меньше 25, после увеличьте его значение на 10, после возведите в квадрат, и найдите
первое число меньше 100, если такого нет, верните -1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(50));
        }

        int res = list.stream()
                .filter(v -> v < 25)
                .map(v -> v + 10)
                .map(v -> v * v)
                .filter(v -> v < 100)
                .findFirst()
                .orElse(-1);

        System.out.println(res);
    }
}
