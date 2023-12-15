package JavaConsultations.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
https://annimon.com/article/2778#top
 */
public class Stream {
    public static void main(String[] args) {
//        IntStream.of(120, 410, 85, 32, 314, 12)
//                .filter(x -> x < 300)
//                .map(x -> x + 11)
//                .limit(3)
//                .forEach(System.out::println);

        Random random = new Random();
        List<Integer> list = random.ints(0, 100)
                .limit(100_000_000)
                .boxed()
                .collect(Collectors.toList());

        long startTime = System.currentTimeMillis();
        List<Integer> filteredList = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        filteredList = list.parallelStream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


    }
}
