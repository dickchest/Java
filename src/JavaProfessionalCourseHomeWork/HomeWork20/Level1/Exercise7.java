package JavaProfessionalCourseHomeWork.HomeWork20.Level1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
7. Пусть дана коллекция состоящая из строк. Arrays.asList("Highload", "High", "Load", "Highload").
- Вывести, сколько раз объект "High" встречается в коллекции.
- Какой элемент в коллекции находится на первом месте? Если мы получили пустую коллекцию, то пусть возвращается 0.
 */
public class Exercise7 {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("Highload", "High", "Load", "Highload");

        long count = array.stream()
                .filter(v->v.equals("High"))
                .count();

        System.out.println(count);

        Optional<String> firstPlace = array.stream()
                .findFirst();

        System.out.println(firstPlace);
    }
}
