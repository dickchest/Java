package JavaProfessionalCourse.Lesson20_FlatMap_Collectors.RepeatHW19;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Task01 {
    public static void main(String[] args) {
        List.of("test", "t", "test","test1","test2","test1234","test1")
                .stream()
                .min(Comparator.comparing(String::length));

        Function<String, String> function = v->v;
        test(function);
    }

    public static void test (Object o) {
        System.out.println(o);
    }
}
