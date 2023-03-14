package JavaProfessionalCourse.Lesson11_Queue_Stack_ArrayDeque.RepeatHomeWork10.Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task6 {
    public static void main(String[] args) {

    List<Advertisement> adv = Arrays.asList(
            new Advertisement(100, "garaj", "nedorog", "ded", 2010),
            new Advertisement(100, "toy", "nedorog", "ded", 2011),
            new Advertisement(1000, "car", "ne bespokoit", "ancle", 2015),
            new Advertisement(120, "garaj", "kachenstov", "ded", 2013),
            new Advertisement(100, "boat", "nedorog", "ded", 2012)
            );

    Newspaper waltstreetjonranl = new Newspaper(adv, new Namecomparator());
    Newspaper mursilka = new Newspaper(new ArrayList<>(adv), new Namecomparator().thenComparing(new PriceComparator()));

        System.out.println(waltstreetjonranl);
        System.out.println(mursilka);



    }
}
