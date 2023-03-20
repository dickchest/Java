package JavaProfessionalCourse.Lesson18_Stream;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> test = Optional.ofNullable("Test");
        testString(test);
        testString(Optional.of("tet"));
        testString(Optional.of("teta"));
        testString(Optional.empty());
        testString(Optional.empty());

    }

    private static void testString(Optional<String> str) {
        str.filter(v -> v.length() > 3).map(s-> s.substring(0,3)).ifPresent(System.out::println);
//        System.out.println(str.orElse(null));

//        if (str.isPresent()) {
//        System.out.println(str.get());
//
//        } else {
//            System.out.println("null");
//        }
    }
}
