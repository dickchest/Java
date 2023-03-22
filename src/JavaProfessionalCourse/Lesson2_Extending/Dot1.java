package JavaProfessionalCourse.Lesson2_Extending;

public final class Dot1 extends Circle1 {

    @Override
    public String toString() {
        return "Dot{" +
                "radius=" + radius +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
