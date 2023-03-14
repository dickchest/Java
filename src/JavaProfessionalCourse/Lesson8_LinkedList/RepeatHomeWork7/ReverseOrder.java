package JavaProfessionalCourse.Lesson8_LinkedList.RepeatHomeWork7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOrder {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
        List<String> names = Arrays.asList("first", "second", "third", "fourth");
        // создается неизменяемый лист

        List<String> reverseOrder = new ArrayList<>();

        for (int i = 0; i < names.size() / 2; i++) {
            String temp = names.get(i);
            names.set(i, names.get(names.size() - 1) );
            names.set(names.size()-i-1, temp);
        }

    }
}
