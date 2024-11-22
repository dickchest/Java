package book_ImproveJava.methodReverence;

import java.util.Arrays;
import java.util.List;

public class Country_InstanceMethodReference {
    public static void main(String[] args) {
        List<String> counries = Arrays.asList("US", "DE", "IN");
        System.out.println("\n... Lambda Expression");
        counries.forEach(message -> new Display().print(message));

        System.out.println("\n... Instance method reference");
        Display display = new Display();
        counries.forEach(display::print);
    }
}
