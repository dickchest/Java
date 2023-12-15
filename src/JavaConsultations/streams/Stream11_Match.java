package JavaConsultations.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11_Match {
    public static void main(String[] args) {
        /*
        boolean allMatch(Predicate predicate)
        Возвращает true, если все элементы стрима удовлетворяют условию predicate. Если встречается какой-либо элемент,
        для которого результат вызова функции-предиката будет false, то оператор перестаёт просматривать элементы и возвращает false.
        */
        boolean result = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .allMatch(x -> x < 8);
        System.out.println(result);

        result = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .allMatch(x -> x < 3);
        System.out.println(result);

        /*
        boolean anyMatch(Predicate predicate)
        Возвращает true, если хотя бы один элемент стрима удовлетворяет условию predicate. Если такой элемент встретился,
        нет смысла продолжать перебор элементов, поэтому сразу возвращается результат.
         */
        System.out.println("anyMatch: " +
                IntStream.range(0, 9)
                        .anyMatch(x -> x > 3)
        );

        result = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x -> x == 8);
        System.out.println("anyMatch: " + result);

        /*
        boolean noneMatch(Predicate predicate)
        Возвращает true, если, пройдя все элементы стрима, ни один не удовлетворил условию predicate.
        Если встречается какой-либо элемент, для которого результат вызова функции-предиката будет true,
        то оператор перестаёт перебирать элементы и возвращает false.
         */

        System.out.println("noneMatch: " +
                IntStream.range(0, 8)
                        .noneMatch(x -> x == 8)
        );


    }
}
