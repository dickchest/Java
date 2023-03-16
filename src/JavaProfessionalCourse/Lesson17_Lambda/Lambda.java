package JavaProfessionalCourse.Lesson17_Lambda;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
//        Func func = new Func();
//        System.out.println(func.apply(1));
        MyFunction f = new MyFunction() {
            @Override
            public int apply(int x, int y) {
                return x + y + 1;
            }
        };

        // лямбда-выражение:
        int v = 1;
        int v2 = 2;
        int z = 1;

        MyFunction f2 = (x, y) -> z + x + y + 1;

        System.out.println(f2.apply(1, 1));
        System.out.println(f.apply(1, 1));

        BiConsumer<String,String> c = (s, s2) -> System.out.println(s + "____" + s2);

        BiConsumer<String,String> c1 = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "____" + s2);
            }
        };

        c.accept("1234","6789");
        c1.accept("1234","6789");

        Supplier<Integer> s = () -> ThreadLocalRandom.current().nextInt();
        System.out.println(s.get());

        Function<Integer, Integer> func = x -> x+1;
        System.out.println(func.apply(5));

        Predicate<String> predicate = str -> str.isEmpty();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("123"));




    }
}
