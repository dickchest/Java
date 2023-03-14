package JavaProfessionalCourseHomeWork.HomeWork9_Set;

import java.util.*;

/*
5. Создайте ArrayList, LinkedList, TreeSet,HashSet и вставьте в него 10 млн объектов, сделайте замер времени
Сделайте выводы на основе полученных результатов, почему какая-то коллекция была быстрее другой
 */
public class Exercise5 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();

        System.out.println("ArrayList");
        fillIn(arrayList);
        System.out.println("LinkedList");
        fillIn(stringList);
        System.out.println("TreeSet");
        fillIn(treeSet);
        System.out.println("HashSet");
        fillIn(hashSet);

    }

    public static Collection<String> fillIn(Collection<String> collection) {
        double timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            collection.add("test");
        }
        double timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
        return collection;
    }
}
