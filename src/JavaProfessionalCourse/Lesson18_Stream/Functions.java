package JavaProfessionalCourse.Lesson18_Stream;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {

        Function<Integer, Integer> func = Functions::parabolicFuction; // x-> parabolicFunc(x)
        BiFunction<Integer, Integer, Double> quadraticFunc = Math::pow;

        System.out.println(func.apply(3)); // x -> и ссылка на метод

        System.out.println(quadraticFunc.apply(3, 2));

        calculateFunc(func, 1);

    }

    public static int parabolicFuction(int x) {
        return x + 5 - x * x + 3;
    }

    public static  <T extends Number> void  calculateFunc(Function<T, T> func, T param){
        System.out.println(func.apply(param));
    }
}
