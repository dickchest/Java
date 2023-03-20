package JavaProfessionalCourse.Lesson18_Stream;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> getIntFromRemoteServer = () -> new Random().nextInt();
        // отложенная инициализация
        Supplier<List<Integer>> lazyInit = () -> {
            return List.of(1,2,5,8,15);
        };
        System.out.println(getIntFromRemoteServer.get());
        System.out.println(getIntFromRemoteServer.get());
        System.out.println(getIntFromRemoteServer.get());
        System.out.println(getIntFromRemoteServer.get());
        System.out.println(getIntFromRemoteServer.get());

        System.out.println(lazyInit.get());

        // predicate
        Aircraft air = new Aircraft("Test", 19);
        Aircraft air2 = new Aircraft("Test2", 9);
        Predicate<Aircraft> isMoreThen10Years = aircraft -> aircraft.age> 10;
        Predicate<Aircraft> nameLenMoreThenThree = aircraft -> aircraft.name.length()> 3;

        if (isMoreThen10Years.or(nameLenMoreThenThree).test(air)) {
            // ......
        }

        Consumer<String> printer = s-> System.out.println(s); // посредник
        Consumer<String> printer1 = System.out::println; // посредник

//        Optional<String> o = Optional.ofNullable();
//        if (Optional.ofNullable(air.name.length()) > 3 || air.age > 10) {
            // ....
    }
}
