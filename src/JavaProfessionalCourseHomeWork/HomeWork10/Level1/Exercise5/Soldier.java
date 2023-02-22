package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise5;

import org.jetbrains.annotations.NotNull;

public class Soldier implements Comparable<Soldier>{

    private int height;

    public Soldier(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Soldier soldier = (Soldier) o;

        return Double.compare(soldier.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "height=" + height +
                '}';
    }


    @Override
    public int compareTo(@NotNull Soldier o) {
        return Integer.compare(this.getHeight(), o.getHeight());
    }
}
