package book_ImproveJava.methodReverence;

import java.util.Arrays;
import java.util.List;

public class Country_StaticMethodReference {

    public static void main(String[] args) {
        List<String> counries = Arrays.asList("US", "DE", "IN");
        System.out.println("\n... Lambda Expression");
        counries.forEach(name -> System.out.println(name));

        System.out.println("\n... Static method reference");
        counries.forEach(System.out::println);
    }
}
