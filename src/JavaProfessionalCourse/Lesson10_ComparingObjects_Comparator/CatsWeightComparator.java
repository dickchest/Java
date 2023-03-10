package JavaProfessionalCourse.Lesson10_ComparingObjects_Comparator;

import java.util.Comparator;

public class CatsWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
