package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import java.util.Comparator;

public class booksPublishHouseComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublishHouse().getName().compareTo(o2.getPublishHouse().getName());
    }
}
