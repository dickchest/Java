package JavaConsultations.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream10_Collector {
    public static void main(String[] args) {
        /*
        R collect(Collector collector)
        Один из самых мощных операторов Stream API. С его помощью можно собрать все элементы в список, множество или другую коллекцию,
        сгруппировать элементы по какому-нибудь критерию, объединить всё в строку и т.д..
        В классе java.util.stream.Collectors очень много методов на все случаи жизни, мы рассмотрим их позже.
        При желании можно написать свой коллектор, реализовав интерфейс Collector.
         */
        List<Integer> list = Stream.of(1, 2, 3)
                .collect(Collectors.toList());
        System.out.println(list);

        String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">"));
        System.out.println(s);

        /*
        R collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)
        То же, что и collect(collector), только параметры разбиты для удобства.
        Если нужно быстро сделать какую-то операцию, нет нужды реализовывать интерфейс Collector, достаточно передать три лямбда-выражения.

        supplier должен поставлять новые объекты (контейнеры), например new ArrayList(),
        accumulator добавляет элемент в контейнер, combiner необходим для параллельных стримов и объединяет части стрима воедино.
         */
        List<String> list1 = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//                .collect(() -> new ArrayList<String>(), (strings, e) -> strings.add(e), (strings1, c) -> strings1.addAll(c));
        System.out.println(list1);

        /*
        Object[] toArray()
        Возвращает нетипизированный массив с элементами стрима.

        A[] toArray(IntFunction<A[]> generator)
        Аналогично, только возвращает типизированный массив.
         */
        String[] elements = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new);
//                .toArray(value -> new String[value]);
        System.out.println(Arrays.toString(elements));

        /*
        List<T> toList()
        Наконец-то добавлен в Java 16. Возвращает список, подобно collect(Collectors.toList()).
        Отличие в том, что теперь возвращаемый список гарантированно нельзя будет модифицировать.
        Любое добавление или удаление элементов в полученный список будет сопровождаться исключением UnsupportedOperationException.
         */
        List<String> elements1 = Stream.of("a", "b", "c", "d")
                .map(String::toUpperCase)
//                .map(s1 -> s1.toUpperCase())
                .toList();
        System.out.println(elements1);

        /*
        T reduce(T identity, BinaryOperator accumulator)
        U reduce(U identity, BiFunction accumulator, BinaryOperator combiner)
        Ещё один полезный оператор. Позволяет преобразовать все элементы стрима в один объект. Например, посчитать сумму всех элементов, либо найти минимальный элемент.
        Сперва берётся объект identity и первый элемент стрима, применяется функция accumulator и identity становится её результатом. Затем всё продолжается для остальных элементов.
         */
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(10, (acc, x) -> acc + x);
        System.out.println(sum);

        /*
        Optional reduce(BinaryOperator accumulator)
        Этот метод отличается тем, что у него нет начального объекта identity. В качестве него служит первый элемент стрима.
        Поскольку стрим может быть пустой и тогда identity объект не присвоится, то результатом функции служит Optional,
        позволяющий обработать и эту ситуацию, вернув Optional.empty().
         */
        Optional<Integer> result = Stream.<Integer>empty()
                .reduce((acc, x) -> acc + x);
        System.out.println(result.isPresent());

        Optional<Integer> sum1 = Stream.of(1, 2, 3, 4, 5)
                .reduce((acc, x) -> acc + x);
        System.out.println(sum1.get());

        int sum2 = IntStream.of(2, 4, 6, 8)
                .reduce(5, (acc, x) -> acc + x);
        System.out.println(sum2);

        int sum3 = IntStream.rangeClosed(2, 8)
                .filter(x -> x % 2 == 0)
                .reduce(5, (acc, x) -> acc + x);
        System.out.println(sum3);

        int product = IntStream.range(0, 10)
                .filter(x -> x++ % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .getAsInt();
        System.out.println(product);

        /*
        Optional min(Comparator comparator)
        Optional max(Comparator comparator)
        Поиск минимального/максимального элемента, основываясь на переданном компараторе. Внутри вызывается reduce:
        reduce((a, b) -> comparator.compare(a, b) <= 0 ? a : b));
        reduce((a, b) -> comparator.compare(a, b) >= 0 ? a : b));
         */
        int min = Stream.of(20, 11, 45, 78, 13)
                .min(Integer::compare).get();
        System.out.println(min);

        int max = Stream.of(20, 11, 45, 78, 13)
                .max(Integer::compareTo).get();
        System.out.println(max);

        /*
        Optional findAny()
        Возвращает первый попавшийся элемент стрима. В параллельных стримах это может быть действительно любой элемент, который лежал в разбитой части последовательности.

        Optional findFirst()
        Гарантированно возвращает первый элемент стрима, даже если стрим параллельный.
        Если нужен любой элемент, то для параллельных стримов быстрее будет работать findAny().
         */
        int anySeq = IntStream.range(4, 65536)
                .findAny()
                .getAsInt();
        System.out.println(anySeq);

        System.out.println(
                IntStream.range(4, 65536)
                        .findAny()
                        .getAsInt()
        );

        int anyParallel = IntStream.range(4, 65536)
                .parallel()
                .findAny()
                .getAsInt();
        System.out.println(anyParallel);

        anyParallel = IntStream.range(4, 65536)
                .parallel()
                .findFirst()
                .getAsInt();
        System.out.println(anyParallel);
    }
}
