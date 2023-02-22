package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise6;

import java.util.Comparator;

public class AdvertNameComparator implements Comparator<Advert> {
    @Override
    public int compare(Advert o1, Advert o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
