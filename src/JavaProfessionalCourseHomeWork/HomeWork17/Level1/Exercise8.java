package JavaProfessionalCourseHomeWork.HomeWork17.Level1;

import java.util.function.IntFunction;

public class Exercise8 {
    public static void main(String[] args) {

        IntFunction<Integer> function1 = x -> x * x - 8 * x + 12;
        IntFunction<Integer> function2 = x -> 5 * x * x + 3 * x + 7;
        IntFunction<Integer> function3 = x -> x * x - 6 * x + 9;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Function 1 = " + function1.apply(i));
            System.out.println("Function 1 = " + function2.apply(i));
            System.out.println("Function 1 = " + function3.apply(i));
        }
    }
}
