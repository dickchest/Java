package JavaProfessionalCourseHomeWork.HomeWork18.Level1;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
Напишите функции:
8. printer которая будет заниматься печатанием в консоль входного параметра и вызовите эту фнкцию на строке, интежере и дабле
 */
public class Exercise8 {
    public static void main(String[] args) {
        Function<Object, Object> printer = Function.identity();
        Consumer<Object> printer1 = System.out::println;

        String stringValue = "Hello World!";
        int integerValue = 45;
        double doubleValue = 12.56;

        System.out.println(printer.apply(stringValue));
        System.out.println(printer.apply(integerValue));
        System.out.println(printer.apply(doubleValue));

        printer1.accept(stringValue);
        printer1.accept(integerValue);
        printer1.accept(doubleValue);
    }
}
