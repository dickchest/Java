package JavaProfessionalCourse.Lesson19_StreamAPI_primitiveStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTest {
    public static void main(String[] args) {
        String str = "123 456 789";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
