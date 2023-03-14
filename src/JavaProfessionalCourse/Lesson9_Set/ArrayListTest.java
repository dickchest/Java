package JavaProfessionalCourse.Lesson9_Set;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("test");
        }

        System.out.println(list);

    }
}
