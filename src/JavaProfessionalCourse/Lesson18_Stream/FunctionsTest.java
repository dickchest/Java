package JavaProfessionalCourse.Lesson18_Stream;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Rustam Khakov
 */
public class FunctionsTest {

    public static void main(String[] args) {
        Function<Integer, Integer> func = FunctionsTest::parabolicFunc; // x-> parabolicFunc(x) Integer (Integer)
        BiFunction<Integer, Integer, Double> quadraticFunc = Math::pow;
        //Integer, Integer
        // Integer -> int -> double
        //pow(double a, double b)

        System.out.println(quadraticFunc.apply(3,2));
        System.out.println(func.apply(3));// x ->

        calculateFunc(func, 1);

    }

    public static int parabolicFunc(int x) {
        return x + 5 - x * x + 3;
    }

    public static <T extends Number> void calculateFunc(Function<T , T> func, T param) {
        System.out.println(func.apply(param));
    }
}
