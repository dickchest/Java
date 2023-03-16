package JavaProfessionalCourseHomeWork.HomeWork17.Level1;

import java.util.function.IntFunction;

public class Exercise7 {
    public static void main(String[] args) {
        IntFunction<Integer> function = x -> x * x;
        for (int i = 0; i < 10; i++) {
            System.out.println(function.apply(i));
        }
    }
}
