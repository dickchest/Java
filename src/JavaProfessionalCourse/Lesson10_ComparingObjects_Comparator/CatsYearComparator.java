package JavaProfessionalCourse.Lesson10_ComparingObjects_Comparator;

import java.util.Comparator;

public class CatsYearComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getBirthYear() < o2.getBirthYear()) {
            return -1;
        }
        if (o1.getBirthYear() == o2.getBirthYear()) {
            return 0;
        }
        return 1;
    }


}
