package JavaConsultations.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream9_TerminalOperators {
    public static void main(String[] args) {
        /*
        void forEach(Consumer action)
        Выполняет указанное действие для каждого элемента стрима.
         */
        Stream.of(120, 410, 85, 32, 314, 12)
                .forEach(x -> System.out.printf("%s, ", x));
        System.out.println("----");
        /*
        void forEachOrdered(Consumer action)
        Тоже выполняет указанное действие для каждого элемента стрима, но перед этим добивается правильного порядка вхождения элементов.
        Используется для параллельных стримов, когда нужно получить правильную последовательность элементов.
         */
        IntStream.range(0, 100_000)
                .parallel()
                .filter(x -> x % 10_000 == 0)
                .map(x -> x / 10_000)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("----");

        IntStream.range(0, 100_000)
                .parallel()
                .filter(x -> x % 10_000 == 0)
                .map(x -> x / 10_000)
                .forEachOrdered(x -> System.out.print(x + " "));
        System.out.println("----");

        /*
        long count()
        Возвращает количество элементов стрима.
         */
        long count = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
//                .peek(x -> System.out.println(x))
                .count();
        System.out.println(count);
        System.out.println("----");

        System.out.println(
                IntStream.rangeClosed(-3, 6)
                        .count()
        );
        System.out.println("----");

        System.out.println(
                Stream.of(0, 2, 9, 13, 5, 11)
                        .map(x -> x * 2)
                        .filter(x -> x % 2 == 1)
                        .count()  // 0
        );
        System.out.println("----");


    }
}
