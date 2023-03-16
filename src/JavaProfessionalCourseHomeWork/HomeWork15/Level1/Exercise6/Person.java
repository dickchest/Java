package JavaProfessionalCourseHomeWork.HomeWork15.Level1.Exercise6;

public class Person {
    private String name;
    private String surName;
    private int yearOfBirth;
    private String position;

    private Sex sex;

    private int counter;

    public Person(String name, String surName, int yearOfBirth, String position, Sex sex, int counter) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.position = position;
        this.sex = sex;
        this.counter = counter;
    }

//    public Person(String name, String surName, int yearOfBirth, String position) {
//        this.name = name;
//        this.surName = surName;
//        this.yearOfBirth = yearOfBirth;
//        this.position = position;
//    }

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

    public Sex getSex() {
        return sex;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", position='" + position + '\'' +
                ", sex=" + sex +
                ", counter=" + counter +
                '}';
    }
}
