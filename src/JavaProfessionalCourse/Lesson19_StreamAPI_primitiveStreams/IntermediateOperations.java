package JavaProfessionalCourse.Lesson19_StreamAPI_primitiveStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(new Random().nextInt(100));
        }
        List.of("String1", "Str2", "Str3", "Str4")
                .stream()
                .mapToInt(String::length);

        Boolean res = integers.stream()
                .filter(v -> v > 30)
                .map(v -> v * v)
                .distinct()
                .skip(10)
                .limit(10)
                .peek(System.out::println)
//                .sorted(Comparator.reverseOrder())
//                .takeWhile(v -> v > 100)
                .allMatch(v -> v < 1_000);
//                .reduce(Integer::sum);
//                .min(Comparator.naturalOrder());
//                .findFirst();
//                .findAny();
//                .toList();
//                .toArray(Integer[]::new);
//                .forEach(v-> {});
//                .collect(Collectors.toList());

//        res.add(123); // операцию не возможно выполнить, т.к. toList возращает unmodifiable list
        System.out.println(res);
    }
}
