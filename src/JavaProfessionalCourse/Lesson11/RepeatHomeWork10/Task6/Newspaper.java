package JavaProfessionalCourse.Lesson11.RepeatHomeWork10.Task6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Newspaper {
    List<Advertisement> advertisements;
    Comparator<Advertisement> comparator;

    public Newspaper(List<Advertisement> advertisements, Comparator<Advertisement> comparator) {
        this.advertisements = advertisements;
        this.comparator = comparator;
        Collections.sort(advertisements, comparator);
    }

    public void addNewAdverteisment(Advertisement advertisement) {
        advertisements.add(advertisement);
        Collections.sort(advertisements, comparator);
    }

    public Advertisement minPriceAdv() {
        Comparator<Advertisement> comp = new PriceComparator();

        return Collections.min(advertisements, comp);
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "advertisements=" + advertisements +
                ", comparator=" + comparator +
                '}';
    }
}
