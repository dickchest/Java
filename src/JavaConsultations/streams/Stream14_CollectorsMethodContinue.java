package JavaConsultations.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream14_CollectorsMethodContinue {
    public static void main(String[] args) {
        /*
        counting()
        Подсчитывает количество элементов.
         */
        Long count = Stream.of("1", "2", "3", "4")
                .collect(Collectors.counting());
        System.out.println(count);
        System.out.println("-----------");

        /*
        filtering(Predicate predicate, Collector downstream)
        mapping(Function mapper, Collector downstream)
        flatMapping(Function downstream)
        reducing(BinaryOperator op)
        reducing(T identity, BinaryOperator op)
        reducing(U identity, Function mapper, BinaryOperator op)
        Специальная группа коллекторов, которая применяет операции filter, map, flatMap и reduce. filtering и flatMapping появились в Java 9.
         */

        List<Integer> ints = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.filtering(
                        x -> x % 2 == 0,
                        Collectors.toList()
                ));
        System.out.println(ints);
        System.out.println("-----------");

        String s1 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.filtering(
                        x -> x % 2 == 0,
                        Collectors.mapping(
                                x -> Integer.toString(x),
                                Collectors.joining("-")
                        )
                ));
        System.out.println(s1);
        System.out.println("-----------");

        // тоже без этого
        String s2 = Stream.of(1, 2, 3, 4, 5, 6)
                .filter(x -> x % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining("-"));
        System.out.println(s2);
        System.out.println("-----------");

        String s3 = Stream.of(2, 0, 1, 3, 2)
                .collect(Collectors.flatMapping(
                        x -> IntStream.range(0, x).mapToObj(Integer::toString),
                        Collectors.joining(", ")
                ));
        System.out.println(s3);
        System.out.println("-----------");

        String s4 = Stream.of(2, 0, 1, 3, 2)
                .flatMapToInt(x -> IntStream.range(0, x))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(s4);
        System.out.println("-----------");

        int value = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.reducing(
                        0, (a, b) -> a+b
                ));
        System.out.println(value);
        System.out.println("-----------");

        String s5 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.reducing(
                        "", x -> Integer.toString(x), (a,b) -> a + b
                ));
        System.out.println(s5);
        System.out.println("-----------");
    }
}
