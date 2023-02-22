package JavaProfessionalCourse.Lesson11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<String> strings = new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.add("Fourth");

        System.out.println(strings);
    }
}
