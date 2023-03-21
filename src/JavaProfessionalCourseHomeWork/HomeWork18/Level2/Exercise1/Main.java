package JavaProfessionalCourseHomeWork.HomeWork18.Level2.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
1. Создайте People(int age, String firstName, String lastName, double weight, int high). Создайте лист и
заполните его 10 различными People
- создайте новый List, к которому примените фильтр возраст больше 18, рост меньше 180, и имя начинается на букву A
- создайте новый List фамилий, к каждому человеку примените фильтр возраст больше 30, фамилия начинается на букву A,
длина имени больше 5
 */
public class Main {
    public static void main(String[] args) {
        List<People> firstList = new ArrayList<>();

        firstList.add(new People(25, "John", "Doe", 80.5, 180));
        firstList.add(new People(42, "Jane", "Smith", 65.2, 165));
        firstList.add(new People(18, "Mike", "Johnson", 70.0, 175));
        firstList.add(new People(37, "Sara", "Williams", 55.8, 160));
        firstList.add(new People(29, "David", "Brown", 90.1, 190));
        firstList.add(new People(31, "Emily", "Davis", 58.6, 170));
        firstList.add(new People(22, "Jacob", "Lee", 75.2, 185));
        firstList.add(new People(50, "Karen", "Taylor", 63.4, 160));
        firstList.add(new People(27, "Amy", "Martin", 67.9, 175));
        firstList.add(new People(45, "Steven", "Anderson", 82.3, 180));

        List<People> resultList = firstList.stream()
                .filter(p -> p.getAge() > 18)
                .filter(p -> p.getHigh() < 180)
                .filter(p -> p.getFirstName().startsWith("A"))
                .collect(Collectors.toList());

        for (People people : resultList) {
            System.out.println(people);
        }

        System.out.println("------------");

        List<People> secondResultList = firstList.stream()
                .filter(p -> p.getAge() > 30)
                .filter(p -> p.getLastName().startsWith("A"))
                .filter(p -> p.getFirstName().length() > 5)
                .collect(Collectors.toList());

        for (People people : secondResultList) {
            System.out.println(people);
        }

    }


}
