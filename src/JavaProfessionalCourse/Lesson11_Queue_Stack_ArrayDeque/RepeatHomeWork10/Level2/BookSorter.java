package JavaProfessionalCourse.Lesson11_Queue_Stack_ArrayDeque.RepeatHomeWork10.Level2;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookSorter {

    public void sort(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("want to sort by name");
        String res = scanner.nextLine();
        Comparator<Book> comparator = null;
        if ("yes".equals(res)) {
            // comparator current = new NameComparator
            if (comparator == null) {
                // comparator = new NameComparator;
            }

            System.out.println("which order");
            String asc = scanner.nextLine();


        }
    }


}
