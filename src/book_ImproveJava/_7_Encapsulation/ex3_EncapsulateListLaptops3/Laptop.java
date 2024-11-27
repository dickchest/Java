package book_ImproveJava._7_Encapsulation.ex3_EncapsulateListLaptops3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Laptop {
    private final List<String> laptops;
    {
        laptops = new ArrayList<>();
        laptops.add("Dell");
        laptops.add("IBM");
        laptops.add("HP");
        laptops.add("Lenovo");
    }

    public List<String> getListLaptops() {
        return Collections.unmodifiableList(laptops);
    }
}
