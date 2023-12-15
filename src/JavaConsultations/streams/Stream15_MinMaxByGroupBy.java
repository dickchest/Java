package JavaConsultations.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream15_MinMaxByGroupBy {
    public static void main(String[] args) {
        /*
        minBy(Comparator comparator)
        maxBy(Comparator comparator)
        Поиск минимального/максимального элемента, основываясь на заданном компараторе.
         */
        Optional<String> min = Stream.of("ab", "c", "defgh", "ijk", "l")
                .collect(Collectors.minBy(Comparator.comparing(String::length)));
        min.ifPresent(System.out::println);
        System.out.println("-----------");

        Optional<String> max = Stream.of("ab", "c", "defgh", "ijk", "l")
                .collect(Collectors.maxBy(Comparator.comparing(String::length)));
        max.ifPresent(System.out::println);
        System.out.println("-----------");

        /*
        groupingBy(Function classifier)
        groupingBy(Function classifier, Collector downstream)
        groupingBy(Function classifier, Supplier mapFactory, Collector downstream)
        Группирует элементы по критерию, сохраняя результат в Map. Вместе с представленными выше агрегирующими коллекторами, позволяет гибко собирать данные.
        Подробнее о комбинировании в разделе Примеры.

        groupingByConcurrent(Function classifier)
        groupingByConcurrent(Function classifier, Collector downstream)
        groupingByConcurrent(Function classifier, Supplier mapFactory, Collector downstream)
        Аналогичный набор методов, только сохраняет в ConcurrentMap.
         */

        Map<Integer, List<String>> map1 = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(String::length));
        map1.entrySet().forEach(System.out::println);
        System.out.println("-----------");

        Map<Integer, String> map2 = Stream.of(
                        "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.joining("-")
                        )
                ));
        map2.entrySet().forEach(System.out::println);
        System.out.println("-----------");

        Map<Integer, List<String>> map3 = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(
                        String::length,
                        LinkedHashMap::new,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.toList()
                        )
                ));
        map3.entrySet().forEach(System.out::println);
        System.out.println("-----------");

        /*
        partitioningBy(Predicate predicate)
        partitioningBy(Predicate predicate, Collector downstream)
        Ещё один интересный метод. Разбивает последовательность элементов по какому-либо критерию.
        В одну часть попадают все элементы, которые удовлетворяют переданному условию, во вторую — все, которые не удовлетворяют.
         */
        Map<Boolean, List<String>> map4 = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.partitioningBy(s -> s.length() <= 2));
        map4.entrySet().forEach(System.out::println);
        System.out.println("-----------");

        Map<Boolean, String> map5 = Stream.of(
                "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.partitioningBy(
                        s -> s.length() <= 2,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.joining()
                        )
                ));
        map5.entrySet().forEach(System.out::println);
    }
}
