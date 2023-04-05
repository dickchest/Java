package JavaProfessionalCourseHomeWork.HomeWork20.Level1;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
8. Нужно пройтись от -40 до 40, возвести каждое значение в квадрат, отфильтровать все что больше 100 и собрать в
- List
- Set
- LinkedList (посмотрите в документации что принимает Collectors.toCollection(..))
 */
public class Exercise8 {
    public static void main(String[] args) {
        List<Integer> listResult = IntStream
                .range(-40, 40)
                .map(v -> v * v)
                .filter(v -> v > 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listResult);

        Set<Integer> setResult = IntStream
                .range(-40, 40)
                .map(v -> v * v)
                .filter(v -> v > 100)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(setResult);

        LinkedList<Integer> linkedListResult = IntStream
                .range(-40, 40)
                .map(v -> v * v)
                .filter(v -> v > 100)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(listResult);
    }
}
