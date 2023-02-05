package JavaProfessionalCourse.Lesson6.HomeWork6.Level2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        2. Задан список фамилий брокеров товарной биржи из N человек. Поменяйте местами фамилии брокеров:
        первого и последнего, второго и предпоследнего, третьего от начала и третьего от конца и т.д.
         */

        List<String> brokersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            brokersList.add("Surname "+ i);
        }
        System.out.println(brokersList);
        for (int i = 0; i < brokersList.size() / 2 ; i++) {
            String tmp;
            tmp = brokersList.get(i);
            brokersList.set(i, brokersList.get(brokersList.size()-i-1));
            brokersList.set(brokersList.size()-i-1, tmp);
        }
        System.out.println(brokersList);
    }
}
