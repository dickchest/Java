package JavaProfessionalCourseHomeWork.HomeWork13.Level1;

import java.util.TreeMap;

/*
Integer - номер квартиры в доме, People(firstName, lastName) Используя TreeMap<Integer, People>
заполните его 10 людьми с разными номерами квартир, ключ в мапе - номер квартиры, после выведите в консоль все значения
 */
public class Exercise8 {
    public static void main(String[] args) {
        Integer apartmentNumber;
        TreeMap<Integer, People> addresses = new TreeMap<>();

        addresses.put(1, new People("Ivan", "Ivanov"));
        addresses.put(2, new People("Alexandra", "Lebedeva"));
        addresses.put(3, new People("Mikhail", "Petrov"));
        addresses.put(4, new People("Elena", "Kuznetsova"));
        addresses.put(5, new People("Igor", "Sidorov"));
        addresses.put(6, new People("Ksenia", "Yakovleva"));
        addresses.put(7, new People("Andrey", "Kozlov"));
        addresses.put(8, new People("Natalya", "Ivanova"));
        addresses.put(9, new People("Dmitry", "Krylov"));
        addresses.put(10, new People("Anastasia", "Belova"));

        System.out.println(addresses);


    }
}

