package JavaProfessionalCourseHomeWork.HomeWork11.Level1;

import java.util.HashSet;
import java.util.Set;

/*
7. Есть массив из Integer, но там произошло дублирование одного из чисел, нужно найти на какой позиции
и значение элемента которое задублировалось Подсказка: add у Set возвращает boolean,
посмотрите в документации когда он возвращает true, когда false, это можно использовать для нахождения дубликата

 */
public class Exercise7 {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i])) {
                System.out.printf("Дубликат найден на позиции %d, значение: %d", i, array[i]);
                break;
            }
        }
    }
}
