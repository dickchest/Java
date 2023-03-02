package JavaProfessionalCourse.Lesson13Trees.RepeatHW11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        long resSum = 0L;
        int numberOfExperiments = 10;
        for (int j = 0; j < numberOfExperiments; j++) {

            Queue<String> queue = new LinkedList<>();
            long before = System.currentTimeMillis();
            for (int i = 0; i < 1_000_000; i++) {
                queue.add("test");
            }
            long result = System.currentTimeMillis() - before;
            System.out.println(result);
            resSum += result;
        }
        System.out.println(resSum / numberOfExperiments);

        // vip
    }
}
