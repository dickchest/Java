package JavaProfessionalCourseHomeWork.HomeWork19.Level1;
/*
11. Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob". сколько раз объект «Big» встречается в коллекции
 */
import java.util.Arrays;
import java.util.List;

public class Exercise11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        long count = list.stream()
                .filter(v -> v.contains("Big"))
                .count();

        System.out.println(count);
    }
}
