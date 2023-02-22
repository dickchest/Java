package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import java.util.Comparator;

public class booksAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().getSurName().compareTo(o2.getAuthor().getSurName());
    }
}
