package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Newspaper {
    public static void main(String[] args) {
        List<Advert> newspaper = new ArrayList<>();
        newspaper.add(new Advert(15.62, "New House", "new house for sale", "Petrov", 2001));
        newspaper.add(new Advert(25.73, "Car Honda", "dream car for sale", "Sidorov", 2011));
        newspaper.add(new Advert(70.56, "Kitchen for sale", "kitchen for sale", "Petrov", 2021));
        newspaper.add(new Advert(95.30, "New bicycles", "Bicycle shop represents new models", "Sidorov", 2022));
        newspaper.add(new Advert(13, "Bookshelf", "furniture from city library", "Ivanov", 2022));
        newspaper.add(new Advert(25, "Secondhand books", "variety of second hand books", "Ivanov", 2001));
        newspaper.add(new Advert(33, "Invitation to the party", "birthday party tomorrow", "Petrov", 2012));
        newspaper.add(new Advert(14, "Toy basketball field", "toy shop sells", "Basharov", 2015));
        newspaper.add(new Advert(156, "Tickets for Basketball", "new sport events", "Zelenskyy", 2018));
        newspaper.add(new Advert(15.62, "Basket second used", "old basket for sale", "Napoleon", 2000));

        Comparator<Advert> customComparator = new AdvertYearComparator()
                .thenComparing(new AdvertNameComparator())
                .thenComparing(new AdvertAuthorComparator())
                .thenComparing(new AdvertDescriptionComparator());

        Collections.sort(newspaper, customComparator);

        System.out.println(newspaper);

        // Exercise 7

        System.out.println(Collections.min(newspaper, customComparator));
        System.out.println(Collections.max(newspaper, customComparator));
    }

}
