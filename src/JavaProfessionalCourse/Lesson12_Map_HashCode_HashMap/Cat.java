package JavaProfessionalCourse.Lesson12_Map_HashCode_HashMap;

import JavaProfessionalCourseHomeWork.HomeWork2.Level1.Zoo.Animal;

import java.util.Objects;

public class Cat extends Animal implements Cloneable{
    private int age;
    private String name;
    private Toy toy;

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public int getAge() {
        return age;
    }

    public Cat() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Cat clone = (Cat) super.clone();
        clone.setToy((Toy) toy.clone());
        return clone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(String name, String color, int age, String name1) {
        super(name, color);
        this.age = age;
        this.name = name1;
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public void eat(String food) {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", toy=" + toy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (!Objects.equals(name, cat.name)) return false;
        return Objects.equals(toy, cat.toy);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (toy != null ? toy.hashCode() : 0);
        return result;
    }
}
