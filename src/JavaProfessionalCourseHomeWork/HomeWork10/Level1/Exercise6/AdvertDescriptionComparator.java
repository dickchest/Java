package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise6;

import java.util.Comparator;

public class AdvertDescriptionComparator implements Comparator<Advert> {
    @Override
    public int compare(Advert o1, Advert o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
