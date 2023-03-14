package JavaProfessionalCourseHomeWork.HomeWork16.Level2;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MyMath {

    public static <T> T getMax(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        T max = list.get(0);

        for (T t : list) {
            if (comparator.compare(t, max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("list is empty");
            return null;
        }
        T max = list.get(0);
        for (T t : list) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public static <T> T getMax(Collection<T> collection, Comparator<T> comparator) {
        if (collection.isEmpty()) {
            System.out.println("Collection is empty");
            return null;
        }
        T max = null;

        for (T t : collection) {
            if (max == null || comparator.compare(t, max) > 0) {
                max = t;
            }
        }

        return max;
    }

    public static <T extends Comparable<T>> T getMax(Collection<T> collection) {
        if (collection.isEmpty()) {
            System.out.println("Collection is empty");
            return null;
        }
        T max = null;

        for (T t : collection) {
            if (max == null || t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
