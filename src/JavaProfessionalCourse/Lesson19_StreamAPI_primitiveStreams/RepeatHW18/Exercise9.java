package JavaProfessionalCourse.Lesson19_StreamAPI_primitiveStreams.RepeatHW18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
9. Проведения отложенной сортировки, функция будет принимать List и компаратор для сравнения и вызывает
Collection.sort (подумайте про ссылку на метод)
 */
public class Exercise9 {
    public static void main(String[] args) {
        List<String> stringsCollections = new ArrayList<>();
        stringsCollections.add("Max");
        stringsCollections.add("Petya");
        stringsCollections.add("Anton");
        stringsCollections.add("David");
        stringsCollections.add("Mustafa");
        stringsCollections.add("Karim");
        stringsCollections.add("Michael");
        stringsCollections.add("Mila");

//        BiConsumer<List<String>, Comparator<String>> sort = (list,comp) -> Collections.sort(list, comp);
        BiConsumer<List<String>, Comparator<String>> sort = Collections::sort;
//        sort.accept(stringsCollections, String::compareTo);
        sort.accept(stringsCollections, String::compareTo);

        System.out.println(stringsCollections);

    }

    public <T> void sort(List<T> list4sort, Comparator<T> comparator) {
        Collections.sort(list4sort, comparator);
    }
}
