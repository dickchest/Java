package JavaProfessionalCourse.Lesson11_Queue_Stack_ArrayDeque.RepeatHomeWork10.Task6;

import java.util.Comparator;

public class PriceComparator implements Comparator<Advertisement> {

    @Override
    public int compare(Advertisement o1, Advertisement o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
