package JavaProfessionalCourse.Lesson9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Test");
        set.add("Test2");
        set.add("Test3");
        set.add("Test33");
        set.add("Test5");
        set.add("Test6");

        Set<String> hashSet = Set.of("first", "test", "petya");
        System.out.println(set);

    }
}
