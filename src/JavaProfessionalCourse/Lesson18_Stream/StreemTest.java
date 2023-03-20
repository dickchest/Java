package JavaProfessionalCourse.Lesson18_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreemTest {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100 ; i++) {
            values.add(random.nextInt(1000));
        }
        List<Integer> res1 = values.stream().parallel()
                .filter(i-> i> 10)
                .filter(i-> i%2 == 0)
                .map(i -> "test" + i)
                .map(s->s.length())
                .sorted()
                .collect(Collectors.toList());
//        Stream<Integer> stream = values.stream();
        System.out.println(res1);

        List<Integer> res = new ArrayList<>();
        for (int i: values) {
            if (i>10) {
                if (i%2 == 0) {
                    String s = "test" + i;
                    res.add(s.length());
                }
            }
        }
        System.out.println(res);
    }
}
