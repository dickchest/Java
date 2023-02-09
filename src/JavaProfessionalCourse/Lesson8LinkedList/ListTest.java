package JavaProfessionalCourse.Lesson8LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
//        List<String> list =List.of(null); //
//        List<String> list1 = Arrays.asList(null, "first"); // нельязя заносить налл


        list.add(null);
        System.out.println(list);
    }
}
