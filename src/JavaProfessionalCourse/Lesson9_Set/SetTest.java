package JavaProfessionalCourse.Lesson9_Set;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetTest {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        ConcurrentSkipListSet<String> set1 = new ConcurrentSkipListSet<>();
        set.add("test");
        set.add("sort");
        set.add("plan");
        set.add("high");
        set.add("less");
        set.add("charge11");
        set.add("char");
        set.add("charge");
        System.out.println(set);
        System.out.println(set.headSet("high"));
        System.out.println(set.tailSet("high"));

        System.out.println(set.higher("less"));
        System.out.println(set.floor("less"));
        System.out.println(set.ceiling("less"));
        System.out.println(set.lower("less"));






    }
}
