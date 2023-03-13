package JavaProfessionalCourseHomeWork.HomeWork15.Level1.Exercise6;

public class Person {
    private String name;
    private String surName;
    private int yearOfBirth;
    private String position;

    public Person(String name, String surName, int yearOfBirth, String position) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", position='" + position + '\'' +
                '}';
    }
}
