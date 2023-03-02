package JavaProfessionalCourseHomeWork.HomeWork13.Level1;
/*
9. Создайте TreeMap где обход будет в обратном порядке (подсказка: для того чтобы указать другой
порядок можно создать Comparator и передать как параметр конструктора TreeMap) и распечатайте результаты
 */

import java.util.Comparator;
import java.util.TreeMap;

public class Exercise9 {

    public static void main(String[] args) {


        Integer apartmentNumber;
        TreeMap<Integer, People> addressesReversed = new TreeMap<>(Comparator.reverseOrder());

        addressesReversed.put(1, new People("Ivan", "Ivanov"));
        addressesReversed.put(2, new People("Alexandra", "Lebedeva"));
        addressesReversed.put(3, new People("Mikhail", "Petrov"));
        addressesReversed.put(4, new People("Elena", "Kuznetsova"));
        addressesReversed.put(5, new People("Igor", "Sidorov"));
        addressesReversed.put(6, new People("Ksenia", "Yakovleva"));
        addressesReversed.put(7, new People("Andrey", "Kozlov"));
        addressesReversed.put(8, new People("Natalya", "Ivanova"));
        addressesReversed.put(9, new People("Dmitry", "Krylov"));
        addressesReversed.put(10, new People("Anastasia", "Belova"));

        System.out.println(addressesReversed);
    }
}