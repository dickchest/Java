package JavaConsultations.streams;

import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        // Стрим для одного или нескольких перечисленных элементов.
        Stream.of(1, 2, 3)
                .forEach(System.out::println);

        /*-----
        Возвращает пустой стрим, если в качестве аргумента передан null, в противном случае, возвращает стрим из одного элемента.
         */
        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);

        /*
        generate(Supplier s)
        Возвращает стрим с бесконечной последовательностью элементов, генерируемых функцией Supplier s.
         */
        Stream.generate(() -> 6)
                .limit(4)
                .forEach(System.out::println);

        /*
        iterate(T seed, UnaryOperator f)
        Возвращает бесконечный стрим с элементами, которые образуются в результате последовательного применения функции f к итерируемому значению.
        Первым элементом будет seed, затем f(seed), затем f(f(seed)) и так далее.
         */
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(System.out::println);

        /*
        iterate(T seed, Predicate hasNext, UnaryOperator f)
        Появился в Java 9. Всё то же самое, только добавляется ещё один аргумент hasNext: если он возвращает false, то стрим завершается.
        Это очень похоже на цикл for:
         */
        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println);

        /*
        concat(Stream a, Stream b)
        Объединяет два стрима так, что вначале идут элементы стрима A, а по его окончанию последуют элементы стрима B.
         */
        Stream.concat(
                        Stream.of(1, 2, 3),
                        Stream.of(4, 5, 6))
                .forEach(System.out::println);

        Stream.concat(
                Stream.of(10),
                Stream.of(" ", " ")
        ).forEach(System.out::println);

    }
}
