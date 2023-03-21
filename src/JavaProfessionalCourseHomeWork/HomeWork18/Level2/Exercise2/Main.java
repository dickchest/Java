package JavaProfessionalCourseHomeWork.HomeWork18.Level2.Exercise2;
/*
2. Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии, начинающиеся на букву J
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Smith",
                "Johnson",
                "Brown",
                "Taylor",
                "Jones",
                "Miller",
                "Davis",
                "Garcia",
                "Wilson",
                "Anderson"
        );

        List<String> result = names.stream()
                .filter(p -> p.startsWith("J"))
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
}
