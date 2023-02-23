package JavaProfessionalCourseHomeWork.HomeWork11.Level1.Exercise9;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return Boolean.compare(o1.isVip(),o2.isVip());
    }
}
