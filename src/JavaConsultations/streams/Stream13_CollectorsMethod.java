package JavaConsultations.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream13_CollectorsMethod {
    public static void main(String[] args) {
        /*
        toList()
        Самый распространённый метод. Собирает элементы в List.
         */

        /*
        toSet()
        Собирает элементы в множество.
         */

        /*
        toCollection(Supplier collectionFactory)
        Собирает элементы в заданную коллекцию. Если нужно конкретно указать, какой List, Set или другую коллекцию мы хотим использовать,
        то этот метод поможет.
         */
        Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(deque);

        /*
        toMap(Function keyMapper, Function valueMapper)
        Собирает элементы в Map. Каждый элемент преобразовывается в ключ и в значение, основываясь на результате функций keyMapper и valueMapper соответственно.
        Если нужно вернуть тот же элемент, что и пришел, то можно передать Function.identity().
         */
        Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toMap(
                        Function.identity(),
                        x -> x // одно и тоже
                ));
        System.out.println(map1);

        Map<Integer, String> map2 = Stream.of(0, 1, 2, 3, 4, 5)
                .collect(Collectors.toMap(
                        Function.identity(),
                        i -> String.format("%d * 2 = %d", i, i * 2)
                ));
        System.out.println(map2);

        Map<Character, String> map3 = Stream.of(100, 54, 55)
                .collect(Collectors.toMap(
                        i -> (char) i.intValue(),
                        i -> String.format("<%d>", i)
                ));
        System.out.println(map3);

        /*
        toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)
        Аналогичен первой версии метода, только в случае, когда встречается два одинаковых ключа, позволяет объединить значения.
         */
        Map<Integer, String> map4 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i % 5,
                        i -> String.format("<%d>", i),
                        (a, b) -> String.join(", ", a, b)
                ));
        System.out.println(map4);
        // В данном случае, для чисел 50, 55 и 20, ключ одинаков и равен 0, поэтому значения накапливаются. Для 64 и 19 аналогично.

        /*
        toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapFactory)
        Всё то же, только позволяет указывать, какой именно класс Map использовать.
         */
        Map<Integer, String> map5 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i % 5,
                        i -> String.format("<%d>", i),
                        (a, b) -> String.join(", ", a, b),
                        LinkedHashMap::new
                ));
        System.out.println(map5);
        // Отличие этого примера от предыдущего в том, что теперь сохраняется порядок, благодаря LinkedHashList.

        /*
        toConcurrentMap(Function keyMapper, Function valueMapper)
        toConcurrentMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)
        toConcurrentMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapFactory)
        Всё то же самое, что и toMap, только работаем с ConcurrentMap.
         */

        /*
        collectingAndThen(Collector downstream, Function finisher)
        Собирает элементы с помощью указанного коллектора, а потом применяет к полученному результату функцию.
         */
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        System.out.println(list.getClass());

        List<String> list2 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(
                                Function.identity(),
                                s -> s + s),
                        map -> map.entrySet().stream()
                ))
                .map(e -> e.toString())
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        list2.forEach(System.out::println);
        System.out.println("-----------");
        /*
           joining()
        joining(CharSequence delimiter)
        joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
        Собирает элементы, реализующие интерфейс CharSequence, в единую строку. Дополнительно можно указать разделитель, а также префикс и суффикс для всей последовательности.
         */
        String s1 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.joining());
        System.out.println(s1);
        System.out.println("-----------");

        String s2 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.joining("-"));
        System.out.println(s2);
        System.out.println("-----------");

        String s3 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.joining(" -> ", "[", "]"));
        System.out.println(s3);
        System.out.println("-----------");

        /*
        summingInt(ToIntFunction mapper)
        summingLong(ToLongFunction mapper)
        summingDouble(ToDoubleFunction mapper)
        Коллектор, который преобразовывает объекты в int/long/double и подсчитывает сумму.

        averagingInt(ToIntFunction mapper)
        averagingLong(ToLongFunction mapper)
        averagingDouble(ToDoubleFunction mapper)
        Аналогично, но со средним значением.

        summarizingInt(ToIntFunction mapper)
        summarizingLong(ToLongFunction mapper)
        summarizingDouble(ToDoubleFunction mapper)
        Аналогично, но с полной статистикой.
         */
        Integer sum = Stream.of("1","2","3","4","5")
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
        System.out.println("-----------");

        Double avarage = Stream.of("1","2","3","4","5")
                .collect(Collectors.averagingInt(Integer::parseInt));
        System.out.println(avarage);
        System.out.println("-----------");

        DoubleSummaryStatistics stats = Stream.of("1.1", "2.34", "3.14", "4.04")
                .collect(Collectors.summarizingDouble(Double::parseDouble));
        System.out.println(stats);
        System.out.println("-----------");


    }
}
