package JavaProfessionalCourse.Lesson18_Stream;

import java.util.Objects;

public class Aircraft {
    String name;
    int age;
    int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Aircraft(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return age == aircraft.age && Objects.equals(name, aircraft.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
