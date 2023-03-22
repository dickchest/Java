package JavaProfessionalCourse.Lesson2_Extending;

public class Circle1 extends Shape1 {
    int radius;

    public Circle1(int size, int radius, String color) {
        super(size, color);
        this.radius = radius;
    }

    public Circle1() {
//        System.out.println(this);
    }

    @Override
    public void draw() {
        System.out.println("draw Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

//    public void startDraw() {
//        super.draw();
//        super.printSize();
//    }
}
