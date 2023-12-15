package JavaConsultations.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        /*
        builder()
        Создаёт мутабельный объект для добавления элементов в стрим без использования какого-либо контейнера для этого.
         */
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);

        for (int i = 2; i <= 8; i += 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println);


        /*
        IntStream.range(int startInclusive, int endExclusive)
        LongStream.range(long startInclusive, long endExclusive)
        Создаёт стрим из числового промежутка [start..end), то есть от start (включительно) по end.
         */
        IntStream.range(0,10)
                .forEach(System.out::println);
        LongStream.range(-10L, -5L)
                .forEach(System.out::println);

        /*
        IntStream.rangeClosed(int startInclusive, int endInclusive)
        LongStream.rangeClosed(long startInclusive, long endInclusive)
        Создаёт стрим из числового промежутка [start..end], то есть от start (включительно) по end (включительно).
         */
        IntStream.rangeClosed(0,5)
                .forEach(System.out::println);
        LongStream.rangeClosed(-8L, -5L)
                .forEach(System.out::println);


    }
}
