package JavaConsultations.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        list = IntStream.range(0, 1_000_000)
                .parallel()
                .mapToDouble(x -> x * 2000 * Math.sqrt(x))
                .mapToInt(x -> (int) Math.floor(x))
                .boxed()
                .collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
