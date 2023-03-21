package JavaProfessionalCourseHomeWork.HomeWork18.Level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
9. Проведения отложенной сортировки, функция будет принимать List и компаратор для сравнения и
вызывает Collection.sort (подумайте про ссылку на метод)
 */
public class Exercise9 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 1, 2, 5, 7, 5, 3);
        Comparator<Integer> ascOrder = Comparator.naturalOrder();
//        numbers.sort(ascOrder);
        mySort(numbers, ascOrder);
        System.out.println(numbers);
    }

    public static <T> void mySort(List<T> list, Comparator<T> comparator) {
        list.sort(comparator::compare);
    }
}



