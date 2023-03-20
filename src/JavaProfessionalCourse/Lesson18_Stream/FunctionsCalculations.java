package JavaProfessionalCourse.Lesson18_Stream;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionsCalculations {
    public static void main(String[] args) {
        Function<String, String> addPrefix = s -> "Is " + s;
        Function<String, String> addSufix = s -> s + "?";
        String str = "night";
        String res = addPrefix.apply(str);
//        String result = addSufix.apply(res);

        String result = addPrefix.andThen(addSufix).apply(str);
        Function<Integer, Integer> self = Function.identity();

        System.out.println(result);

        Function.identity(); //  t -> t; потом увидим

        BiFunction<Integer, Integer, Double> quadratic = Math::pow;
        long l = quadratic.andThen(Double::longValue).apply(2,3);
        System.out.println(l);


        // consumer = zb logging of doings
        Consumer<String> notificator = System.out::println;
        notificator = notificator.andThen(s-> System.out.println("Отправили на почту информацию о " + s));


        notificator.accept("Рабочий день закончился");
    }
}
