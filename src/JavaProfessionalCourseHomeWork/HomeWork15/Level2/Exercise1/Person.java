package JavaProfessionalCourseHomeWork.HomeWork15.Level2.Exercise1;

import JavaProfessionalCourseHomeWork.HomeWork15.Level1.Exercise6.Sex;

public class Person implements Cloneable {

    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
