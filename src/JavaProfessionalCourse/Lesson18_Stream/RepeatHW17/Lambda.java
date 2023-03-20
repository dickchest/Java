package JavaProfessionalCourse.Lesson18_Stream.RepeatHW17;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        int b = 5; // Integer
        // short -> int -> long -> double
        Function<Double, Double> function1 = x -> Math.pow(x, 2.0) / 2.0 - 2.0*x / 3.0 - (x-2.0) / 6.0;

        // Short !-> Integer !-> Long !-> Double

        System.out.println(function1.apply((double)b));
        System.out.println(func((double)b));

    }

    public static double func(Double x) {
        return Math.pow(x, 2) / 2 - 2*x / 3 - (x-2) / 6;
    }
}
