package JavaProfessionalCourseHomeWork.HomeWork19.Level1;
/*
12. Дан список строк. С помощью Stream API найти самую длинную строку. Найдите самую короткую строку
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        Optional<String> maxString = list.stream()
                .max(Comparator.comparingInt(v-> v.length()));

        Optional<String> minString = list.stream()
                .min(Comparator.comparingInt(String::length));

        System.out.println(maxString);
        System.out.println(minString);

    }
}
