package JavaCourse.Lesson5.HomeWork;

public class Calculator {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int substract(int a, int b) {
        return a-b;
    }
    public static int multiplication(int a, int b) {
        return a*b;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static double exchange(double a, double course) {
        return a*course;
    }
}
