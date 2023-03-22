package JavaProfessionalCourse.Lesson2_Extending;

public class Triangle1 extends Shape1 {
    int firstSide;
    int secondSide;
    int thirdSide;

    public Triangle1() {
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("draw triangle");
    }
}
