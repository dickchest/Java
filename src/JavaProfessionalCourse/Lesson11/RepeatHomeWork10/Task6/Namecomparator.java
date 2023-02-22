package JavaProfessionalCourse.Lesson11.RepeatHomeWork10.Task6;

import java.util.Comparator;

public class Namecomparator implements Comparator<Advertisement> {
    @Override
    public int compare(Advertisement o1, Advertisement o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
