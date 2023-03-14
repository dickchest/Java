package JavaProfessionalCourse.Lesson10_ComparingObjects_Comparator;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int birthYear;
    private int weight;

    public Cat(String name, int birthYear, int weight) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getWeight() {
        return weight;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cat cat = (Cat) o;
//        return Objects.equals(name, cat.name);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Cat cat = (Cat) o;
//
//        return Objects.equals(name, cat.name);
//    }


    public Cat(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (birthYear != cat.birthYear) return false;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + birthYear;
        return result;
    }

    @Override
    public int compareTo(@NotNull Cat o) {
        int yearsCompare = Integer.compare(this.getBirthYear(), o.getBirthYear());
        if (yearsCompare == 0) {
            return this.name.compareTo(o.name);
        }


//        if (this.getBirthYear() > o.getBirthYear()) {
//            return 1;
//        } else if (this.getBirthYear() < this.getBirthYear()) {
//            return -1;
//        } else {
//            return this.name.compareTo(o.name);
//        }
        return yearsCompare;
    }
}
