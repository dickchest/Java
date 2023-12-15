package JavaConsultations.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream8_TakeDropWhile {
    public static void main(String[] args) {
        /*
        takeWhile(Predicate predicate)
        Появился в Java 9. Возвращает элементы до тех пор, пока они удовлетворяют условию,
        то есть функция-предикат возвращает true. Это как limit, только не с числом, а с условием.
         */
        Stream.of(1, 2, 3, 4, 2, 5)
                .takeWhile(x -> x < 3)
                .forEach(System.out::println);
        System.out.println("----");

        IntStream.range(2, 17)
                .takeWhile(x -> x != 5)
                .forEach(System.out::println);
        System.out.println("----");
        /*
        dropWhile(Predicate predicate)
        Появился в Java 9. Пропускает элементы до тех пор, пока они удовлетворяют условию, затем возвращает оставшуюся часть стрима.
        Если предикат вернул для первого элемента false, то ни единого элемента не будет пропущено. Оператор подобен skip, только работает по условию
         */
        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x >= 3)
                .forEach(System.out::println);
        System.out.println("----");

        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x < 3)
                .forEach(System.out::println);
        System.out.println("----");

        IntStream.of(1, 3, 2, 0, 5, 4)
                .dropWhile(x -> x % 2 == 1)
                .forEach(System.out::println);
        System.out.println("----");

        /*
        boxed()
        Преобразует примитивный стрим в объектный.
         */
        DoubleStream.of(0.1, Math.PI)
                .boxed()
                .map(Object::getClass)
                .forEach(System.out::println);




    }
}
