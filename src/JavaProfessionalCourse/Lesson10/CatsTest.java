package JavaProfessionalCourse.Lesson10;

import java.util.*;

public class CatsTest {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", 2010, 3));
        cats.add(new Cat("Barsik", 2015, 4));
        cats.add(new Cat("Barsik", 2015, 3));
        cats.add(new Cat("Matrosskin", 2012, 3));
        cats.add(new Cat("Sharik", 2015, 3));

        Collections.sort(cats);

        System.out.println(cats);

        // сначала по году, потом по имени, потом по весу
        Comparator<Cat> customComparator = new CatsYearComparator().reversed()
                .thenComparing(new CatsNameComparator().reversed())
                .thenComparing(new CatsWeightComparator());
        Collections.sort(cats, customComparator);
        System.out.println(cats);

        TreeSet<Cat> treeSet = new TreeSet<>(new CatsYearComparator().reversed());
        treeSet.addAll(cats);
        System.out.println(treeSet);

        List<String> strings = Arrays.asList("Test", "test2", "hi", "in", "oop", "dry");
        Collections.sort(strings);
        System.out.println(strings);

    }
}
