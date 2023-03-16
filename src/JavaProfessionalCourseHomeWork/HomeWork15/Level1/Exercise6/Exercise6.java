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
        int count = 0;
        Person john = new Person("John", "Doe", 1990, "Developer",Sex.MALE, ++count);
        Person jane = new Person("Jane", "Doe", 1991, "Designer",Sex.FEMALE, ++count);
        Person david = new Person("David", "Smith", 1985, "Manager",Sex.MALE, ++count);
        Person emily = new Person("Emily", "Johnson", 1995, "Accountant",Sex.FEMALE, ++count);
        Person michael = new Person("Michael", "Brown", 1988, "Salesman",Sex.MALE, ++count);
        Person amanda = new Person("Amanda", "Taylor", 1992, "Engineer",Sex.FEMALE, ++count);
        Person robert = new Person("Robert", "Wilson", 1982, "Director",Sex.MALE, ++count);
        Person olivia = new Person("Olivia", "Garcia", 1994, "Marketing Specialist",Sex.FEMALE, ++count);
        Person william = new Person("William", "Jones", 1987, "Customer Support",Sex.MALE, ++count);
        Person sophia = new Person("Sophia", "Rodriguez", 1993, "Human Resources",Sex.FEMALE, ++count);

        Map<PersonalNumber, Person> map = new HashMap<>();

        map.put(new PersonalNumber(john), john);
        map.put(new PersonalNumber(jane), jane);
        map.put(new PersonalNumber(david), david);
        map.put(new PersonalNumber(emily), emily);
        map.put(new PersonalNumber(michael), michael);
        map.put(new PersonalNumber(amanda), amanda);
        map.put(new PersonalNumber(robert), robert);
        map.put(new PersonalNumber(olivia), olivia);
        map.put(new PersonalNumber(william), william);
        map.put(new PersonalNumber(sophia), sophia);


//        Map<PersonalNumber, Person> map = new HashMap<>();
//        map.put(new PersonalNumber(1990, Sex.MALE, person.getSex()), new Person("John", "Doe", 1990, "Developer"));
//        map.put(new PersonalNumber(1991, Sex.FEMALE, person.getSex()), new Person("Jane", "Doe", 1991, "Designer"));
//        map.put(new PersonalNumber(1985, Sex.MALE, person.getSex()), new Person("David", "Smith", 1985, "Manager"));
//        map.put(new PersonalNumber(1995, Sex.FEMALE, person.getSex()), new Person("Emily", "Johnson", 1995, "Accountant"));
//        map.put(new PersonalNumber(1988, Sex.MALE, person.getSex()), new Person("Michael", "Brown", 1988, "Salesman"));
//        map.put(new PersonalNumber(1992, Sex.FEMALE, person.getSex()), new Person("Amanda", "Taylor", 1992, "Engineer"));
//        map.put(new PersonalNumber(1982, Sex.MALE, person.getSex()), new Person("Robert", "Wilson", 1982, "Director"));
//        map.put(new PersonalNumber(1994, Sex.FEMALE, person.getSex()), new Person("Olivia", "Garcia", 1994, "Marketing Specialist"));
//        map.put(new PersonalNumber(1987, Sex.MALE, person.getSex()), new Person("William", "Jones", 1987, "Customer Support"));
//        map.put(new PersonalNumber(1993, Sex.FEMALE, person.getSex()), new Person("Sophia", "Rodriguez", 1993, "Human Resources"));

        for (Person value : map.values()) {
            System.out.println(value);
        }
    }
}
