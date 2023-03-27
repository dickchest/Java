package JavaProfessionalCourse.Lesson20_FlatMap_Collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        IntStream.range(0,10)
                .forEach(System.out::println);

        IntSummaryStatistics intSummaryStatistics = IntStream.range(0, 10).filter(i -> i < 5.).summaryStatistics();
        System.out.println(intSummaryStatistics);

        List<Integer> integers = IntStream.range(0, 10).filter(i -> i < 5.).boxed().collect(Collectors.toList());
        System.out.println(integers);

        List<Integer> range = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        System.out.println(range);

        integers.stream()
                .mapToInt(t->t)
                .forEach(System.out::println);

        List<Integer> integers1 = IntStream.rangeClosed(20, 30).limit(5).boxed().collect(Collectors.toList());
        System.out.println(integers1);
        System.out.println("---");
        Stream.concat(integers.stream(), integers1.stream()).forEach(System.out::println);

        Stream<Integer> integers2 = IntStream.range(0, 10).filter(i -> i < 5.).boxed();
        Stream<Integer> integers3 = IntStream.rangeClosed(20, 30).limit(5).boxed();

        Stream.concat(integers2, integers3).filter(v->v%2==0).forEach(System.out::println);

        List.of("test","test2","test3");
        int[] array = new int[]{1,4,7,4,3,5,2,6,1};
        Arrays.stream(array);

//        Stream.generate(()->{
//            return new Random().nextInt(100);
//        }).forEach(System.out::println);

        Stream.of("str1","str2","test","test1","testSmth").map(String::length).count();
        Stream.builder().add(1).add(2).build();

        //-------------------

        int[][] twoDimensionArray = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                twoDimensionArray[i][j] = random.nextInt(100);
                System.out.print(twoDimensionArray[i][j] + " ");
            }
            System.out.println();
        }

        Arrays.stream(twoDimensionArray).flatMap(row-> Arrays.stream(row).boxed()).forEach(System.out::println);
    }
}
