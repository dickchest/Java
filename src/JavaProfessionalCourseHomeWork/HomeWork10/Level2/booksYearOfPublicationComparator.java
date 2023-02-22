package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import java.util.Comparator;

public class booksYearOfPublicationComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYearOfPublication(), o2.getYearOfPublication());
    }
}
