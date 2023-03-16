package JavaProfessionalCourse.Lesson17_Lambda.RepeatHW16;

import java.util.*;

public class MaxNumberFinder {
    /*
    Любого листа (он должен быть generic)- параметры лист и компаратор
Листа элементов (элементы должны быть наследниками компарабл) - параметры лист
Любой коллекции (он должен быть generic)- параметры коллекция и компаратор
Коллекции элементов (элементы должны быть наследниками компарабл) - параметры коллекция
     */

    public static class Comp implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }


    public <T> T max(List<T> list, Comparator<T> comparator) {
        T max = null;
        for (T val : list) {
            if (max == null || comparator.compare(val, max) > 0) {
                max = val;
            }
        }
        return max;
    }

    public <T extends Comparable<T>> T max(List<T> list) {
        T max = null;
        for (T val : list) {
            if (max == null || val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }

    public <T> T max(Collection<T> list, Comparator<T> comparator) {
        T max = null;
        for (T val : list) {
            if (max == null || comparator.compare(val, max) > 0) {
                max = val;
            }
        }
        return max;
    }

    public <T extends Comparable<T>> T max(Collection<T> list) {
        T max = null;
        for (T val : list) {
            if (max == null || val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }


    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<>();
        Set<Integer> ints = new HashSet<>();
        ints.add(124);
        ints.add(126);
        ints.add(127);
        ints.add(156);
        ints.add(120);

        MaxNumberFinder finder = new MaxNumberFinder();

        System.out.println(finder.max(ints, new Comp()));
        System.out.println(finder.max(ints));

    }


}
