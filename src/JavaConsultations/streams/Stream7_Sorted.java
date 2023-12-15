package JavaConsultations.streams;


import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream7_Sorted {
    public static void main(String[] args) {
    /*
    sorted()
    sorted(Comparator comparator)
    Сортирует элементы стрима. Причём работает этот оператор очень хитро: если стрим уже помечен как отсортированный,
    то сортировка проводиться не будет, иначе соберёт все элементы, отсортирует их и вернёт новый стрим, помеченный как отсортированный.
     */
        IntStream.range(0, 100_000_000)
                .sorted()
                .limit(3)
                .forEach(System.out::print);
        System.out.println();

        IntStream.concat(
                        IntStream.range(0, 100_000_000),
                        IntStream.of(-1, -2))
                .sorted()
                .limit(3)
                .forEach(System.out::print);
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted()
                .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        /*
        distinct()
        Убирает повторяющиеся элементы и возвращаем стрим с уникальными элементами. Как и в случае с sorted,
        смотрит, состоит ли уже стрим из уникальных элементов и если это не так, отбирает уникальные и помечает стрим как содержащий уникальные элементы.
         */
        Stream.of(2, 1, 8, 1, 3, 2)
                .distinct()
//                .sorted()
                .forEach(System.out::print);
        System.out.println();

        IntStream.concat(
                        IntStream.range(2, 5),
                        IntStream.range(0, 4))
                .distinct()
                .forEach(System.out::println);

        /*
        peek(Consumer action)
        Выполняет действие над каждым элементом стрима и при этом возвращает стрим с элементами исходного стрима.
        Служит для того, чтобы передать элемент куда-нибудь, не разрывая при этом цепочку операторов
        (вы же помните, что forEach — терминальный оператор и после него стрим завершается?), либо для отладки.
         */

        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.printf("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x-> System.out.printf("after map: %d%n", x));
    }
}
