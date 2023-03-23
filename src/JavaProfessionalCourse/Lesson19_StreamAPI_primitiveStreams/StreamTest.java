package JavaProfessionalCourse.Lesson19_StreamAPI_primitiveStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(100));
        }

        // найти все четные числа
        List<Integer> resultImperative = new ArrayList<>();
        for (Integer val : integers) {
            if (val % 2 == 0) {
                resultImperative.add(val);
            }
        }
        System.out.println(resultImperative);

        // delrativnysq style

        Stream<Integer> currentStream = integers.stream()
                .filter(val -> val%2 == 0)
                .map(val -> {
                    System.out.println(val);
                    return val;
                });

//        List<Integer> resultDeclarative = integers.stream()
//                .filter(val -> val%2 == 0)
//                .collect(Collectors.toList());

        List<Integer> resultDeclarative = currentStream
                .collect(Collectors.toList());
        // 2 раза применяем инстуркцию - получаем ошибку
//        System.out.println(currentStream.collect(Collectors.toSet()));
        System.out.println(resultDeclarative);


        // for each:
        integers.forEach(System.out::println);
    }


}
