package JavaConsultations.streams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream5_PromejutochnieOperatori {
    public static void main(String[] args) {
        /*
        filter(Predicate predicate)
        Фильтрует стрим, принимая только те элементы, которые удовлетворяют заданному условию.
         */
        Stream.of(1, 2, 3)
                .filter(x -> x == 10)
                .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x > 100)
                .forEach(System.out::println);

        /*
        map(Function mapper)
Применяет функцию к каждому элементу и затем возвращает стрим, в котором элементами будут результаты функции. map можно применять для изменения типа элементов.

Stream.mapToDouble(ToDoubleFunction mapper)
Stream.mapToInt(ToIntFunction mapper)
Stream.mapToLong(ToLongFunction mapper)
IntStream.mapToObj(IntFunction mapper)
IntStream.mapToLong(IntToLongFunction mapper)
IntStream.mapToDouble(IntToDoubleFunction mapper)

Специальные операторы для преобразования объектного стрима в примитивный, примитивного в объектный, либо примитивного стрима одного типа в примитивный стрим другого.
         */
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);

        /*
        flatMap(Function<T, Stream<R>> mapper)
Один из самых интересных операторов. Работает как map, но с одним отличием — можно преобразовать один элемент в ноль, один или множество других.

flatMapToDouble(Function mapper)
flatMapToInt(Function mapper)
flatMapToLong(Function mapper)

Как и в случае с map, служат для преобразования в примитивный стрим.

Для того, чтобы один элемент преобразовать в ноль элементов, нужно вернуть null, либо пустой стрим. Чтобы преобразовать в один элемент,
нужно вернуть стрим из одного элемента, например, через Stream.of(x). Для возвращения нескольких элементов, можно любыми способами создать стрим с этими элементами.
         */
        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::print);

        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    switch (x % 3) {
                        case 0:
                            return Stream.of(x, x * x, x * x * x);
                        case 1:
                            return Stream.of(x);
                        case 2:
                        default:
                            return Stream.empty();
                    }
                })
                .forEach(System.out::println);

            /*
    mapMulti(BiConsumer<T, Consumer<R>> mapper)
Появился в Java 16. Этот оператор похож на flatMap, но использует императивный подход при работе. Теперь вместе с элементом стрима приходит ещё и Consumer,
в который можно передать одно или несколько значений, либо не передавать вовсе.

Вот как было с flatMap:
     */
        Stream.of(1, 2, 3, 4, 5)
                .flatMap(x -> {
                    if (x % 2 == 0) {
                        return Stream.of(-x, x);
                    }
                    return Stream.empty();
                })
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // А вот так можно переписать с использованием mapMulti:
        Stream.of(1,2,3,4,5)
                .mapMulti((x,consumer) -> {
                    if (x % 2 == 0) {
                        consumer.accept(-x);
                        consumer.accept(x);
                    }
                })
                .forEach(System.out::println);

        /*
        У mapMulti есть несколько преимуществ перед flatMap. Во-первых, если приходится пропускать значения (как в примере выше, где пропускались нечётные элементы),
        то не будет затрат на создание пустого стрима. Во-вторых, consumer легко передать в другой метод, в котором можно проводить преобразования, включая рекурсивные.
         */

        Stream.of(arr("A", "B"), "C", "D", arr(arr("E"), "F"), "G")
                .mapMulti(Stream5_PromejutochnieOperatori::processSerializable)
                .forEach(System.out::println);



    }

    static void processSerializable(Serializable ser, Consumer<String> consumer) {
        if (ser instanceof String str) {
            consumer.accept(str);
        } else if (ser instanceof List) {
            for (Serializable s : (List<Serializable>) ser) {
                processSerializable(s, consumer);
            }
        }
    }

    static Serializable arr(Serializable... elements) {
        return (Serializable) Arrays.asList(elements);
    }


}
