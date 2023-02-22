package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator {
    private Comparator<Book> comparator;

    public CustomComparator() {
        this.comparator = null;
    }

    public Comparator<Book> getComparator() {
        return comparator;
    }

    private void setComparator(Comparator<Book> comparator) {
        if (this.comparator == null) {
            this.comparator = comparator;
        } else {
            this.comparator = this.comparator.thenComparing(comparator);
        }
    }

    public void chooseComparator(Scanner scanner, String question, Comparator<Book> comparator) {
        System.out.println(question + " (1 - yes; 0 - no):");
        int res = scanner.nextInt();
        if (res == 0) return;   // если сортировать не нужно = выходим

        System.out.println("По возрастанию или по убыванию? (1 - asc; 0 - des):");
        res = scanner.nextInt();
        if (res == 1) {
            setComparator(comparator);
        } else {
            setComparator(comparator.reversed());
        }
    }
}
