package JavaProfessionalCourse.Lesson2_Extending;

public class Square1 extends Shape1 {
    int width;


    public Square1(int size, String color, int width) {
        super(size, color);
        this.width = width;
    }

    public Square1() {
    }

    @Override
    public void draw() {
        System.out.println("draw squeare");
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
