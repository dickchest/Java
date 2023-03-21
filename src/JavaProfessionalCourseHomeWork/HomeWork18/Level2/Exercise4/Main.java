package JavaProfessionalCourseHomeWork.HomeWork18.Level2.Exercise4;

import java.util.Optional;
import java.util.function.Function;

/*
4. Напишите методы (методы должен использовать Optional), метод будет принимать функцию вычисления какой-нибудь
из формул из предыдущей домашней работы и Integer
- метод 1 должен применять эту формулу к заданному Integer, если он равен null, то возвращать 0
- метод 2 должен применять формулу только, если число больше 4, иначе возвращать 0
- метод 3 должен применять формулу только, если число больше 6 (если число больше 6, то еще отнять от него 6), иначе возвращать квадрат числа
 */
public class Main {
    public static void main(String[] args) {
        Function<Integer, Double> function = x -> Math.pow(x, 2.0) / 2.0 - 2.0*x / 3.0 - (x-2.0) / 6.0;

        System.out.println(applyFormula1(function, 6));
        System.out.println(applyFormula1(function, null));
        System.out.println("---");
        System.out.println(applyFormula2(function, 6));
        System.out.println(applyFormula2(function, 2));
        System.out.println("---");
        System.out.println(applyFormula3(function, 6));
        System.out.println(applyFormula3(function, 8));
    }

    public static double applyFormula1(Function<Integer, Double> function, Integer num) {
        return Optional.ofNullable(num)
                .map(function)
                .orElse((double) 0);
    }

    public static double applyFormula2(Function<Integer, Double> function, Integer num) {
        return Optional.ofNullable(num)
                .filter(n -> n>4)
                .map(function)
                .orElse((double) 0);
    }

    public static double applyFormula3(Function<Integer, Double> function, Integer num) {
        return Optional.ofNullable(num)
                .filter(n -> n> 6)
                .map(n -> n - 6)
                .map(function)
                .orElse((double) (num * num));
    }
}
