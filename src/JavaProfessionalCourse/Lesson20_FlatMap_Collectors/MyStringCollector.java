package JavaProfessionalCourse.Lesson20_FlatMap_Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyStringCollector<T> implements Collector<T, List<String>, String> {

    private String delimeter = "";

    public MyStringCollector(String delimeter) {
        this.delimeter = delimeter;
    }

    public MyStringCollector() {
    }

    @Override
    public Supplier<List<String>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<String>, T> accumulator() {
        return (accum, val) -> accum.add(val.toString());
    }

    @Override
    public BinaryOperator<List<String>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<String>, String> finisher() {
        return (list) -> {
            String result = "";
            for (String s : list) {
                result = result + s + delimeter;
            }
            return result;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}
