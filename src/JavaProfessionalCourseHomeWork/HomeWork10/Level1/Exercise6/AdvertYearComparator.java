package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise6;

import java.util.Comparator;

public class AdvertYearComparator implements Comparator<Advert> {
    @Override
    public int compare(Advert o1, Advert o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
