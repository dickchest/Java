package JavaProfessionalCourseHomeWork.HomeWork19.Level2;

import java.util.*;
import java.util.stream.Collectors;

/*
1. С помощью рандома сгенерируйте 100 чисел (генерацию от -100 до 100), после найдите все числа, которые
по модулю меньше 50, увеличьте значение на 20, после отсортируйте и вытащите с 5 по 10 элемент
из этого списка и соберите его в сет
 */
public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(-100,100));
        }

        Set<Integer> result = list.stream()
                .filter(v->Math.abs(v) < 50)
                .map(v-> v+20)
                .sorted(Comparator.naturalOrder())
                .skip(5)
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}
