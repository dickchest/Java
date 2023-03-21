package JavaProfessionalCourseHomeWork.HomeWork18.Level1;

import java.util.Objects;
import java.util.function.Function;

/*
Напишите функции:
8. printer которая будет заниматься печатанием в консоль входного параметра и вызовите эту фнкцию на строке, интежере и дабле
 */
public class Exercise8 {
    public static void main(String[] args) {
        Function<Object, Object> printer = Function.identity();

        String stringValue = "Hello World!";
        int integerValue = 45;
        double doubleValue = 12.56;

        System.out.println(printer.apply(stringValue));
        System.out.println(printer.apply(integerValue));
        System.out.println(printer.apply(doubleValue));
    }
}
