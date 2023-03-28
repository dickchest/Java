package JavaProfessionalCourseHomeWork.HomeWork20.Level1;
/*
6. Дана коллекция Arrays.asList("f10", "f15", "f2", "f4", "f4"). Нужно выполнить сортировку в обратном
алфавитному порядке и удалить дубликаты. В массиве должны оказаться только уникальные значения
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("f10", "f15", "f2", "f4", "f4");

        List<String> resultArray = array.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(resultArray);
    }
}
