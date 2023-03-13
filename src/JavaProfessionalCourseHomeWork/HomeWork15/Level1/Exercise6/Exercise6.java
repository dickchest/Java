package JavaProfessionalCourseHomeWork.HomeWork15.Level1.Exercise6;

import java.util.HashMap;
import java.util.Map;

/*
6. Есть архив данных компании ключом является параметры (порядковый номер(каким по счету устроился в компанию),
год рождения и пол(используйте enum)), значением является Person(имя, год рождения, фамилия, имя, должность)
Нужно написать и заполнить хешмапу 10 различными людьми
 */
public class Exercise6 {
    public static void main(String[] args) {
        Map<personalNumber, Person> map = new HashMap<>();
        map.put(new personalNumber(1990, Sex.MAIL), new Person("John", "Doe", 1990, "Developer"));
        map.put(new personalNumber(1991, Sex.FEMALE), new Person("Jane", "Doe", 1991, "Designer"));
        map.put(new personalNumber(1985, Sex.MAIL), new Person("David", "Smith", 1985, "Manager"));
        map.put(new personalNumber(1995, Sex.FEMALE), new Person("Emily", "Johnson", 1995, "Accountant"));
        map.put(new personalNumber(1988, Sex.MAIL), new Person("Michael", "Brown", 1988, "Salesman"));
        map.put(new personalNumber(1992, Sex.FEMALE), new Person("Amanda", "Taylor", 1992, "Engineer"));
        map.put(new personalNumber(1982, Sex.MAIL), new Person("Robert", "Wilson", 1982, "Director"));
        map.put(new personalNumber(1994, Sex.FEMALE), new Person("Olivia", "Garcia", 1994, "Marketing Specialist"));
        map.put(new personalNumber(1987, Sex.MAIL), new Person("William", "Jones", 1987, "Customer Support"));
        map.put(new personalNumber(1993, Sex.FEMALE), new Person("Sophia", "Rodriguez", 1993, "Human Resources"));

        for (Person value : map.values()) {
            System.out.println(value);
        }
    }
}
