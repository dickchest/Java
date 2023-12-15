package JavaConsultations.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {
        /*
        limit(long maxSize)
        Ограничивает стрим maxSize элементами.
         */
        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(4)
                .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(2)
                .limit(5)
                .forEach(System.out::println);

        Stream.of(19)
                .limit(0)
                .forEach(System.out::println);

        /*
        skip(long n)
        Пропускает n элементов стрима.
         */
        Stream.of(5,10)
                .skip(40)
                .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println);


        IntStream.range(0, 10)
                .limit(5)
                .skip(3)
                .forEach(System.out::print);
        System.out.println();

        IntStream.range(0, 10)
                .skip(5)
                .limit(3)
                .skip(1)
                .forEach(System.out::println);



    }
}
