package JavaProfessionalCourse.Lesson18_Stream;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Rustam Khakov
 */
public class MegaFormula {
    public static void main(String[] args) {
        // x->
        // if (x > 0) -> 1/x
        // if (x< 0) -> 1/(-x)
        // if x == 0 -> 0

        Function<Integer, Double> absHyperbola = x -> {
            if (x > 0) {
                return 1.0 / x;
            }
            if (x < 0) {
                return 1.0 / -x;
            }
            return 0.0;
        };
        Function<Integer, Function<Integer, Double>> functionFactory = x -> {
            if (x > 0) {
                return v -> 1.0 / v;
            }
            if (x < 0) {
                return v -> 1.0 / -v;
            }
            return v -> 0.0;
        };
        functionFactory.apply(10).apply(10);
        Consumer<String> printer = System.out::println;  // s-> System.out.println(s)

    }
}
