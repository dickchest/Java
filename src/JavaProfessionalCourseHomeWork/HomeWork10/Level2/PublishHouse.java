package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import org.jetbrains.annotations.NotNull;

public class PublishHouse implements Comparable<PublishHouse>{
    private String name;
    private int yearOfGround;

    public PublishHouse(String name, int yearOfGround) {
        this.name = name;
        this.yearOfGround = yearOfGround;
    }

    public String getName() {
        return name;
    }

    public int getYearOfGround() {
        return yearOfGround;
    }

    @Override
    public int compareTo(@NotNull PublishHouse o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "PublishHouse{" +
                name + " (" + yearOfGround +
                ')';
    }
}
