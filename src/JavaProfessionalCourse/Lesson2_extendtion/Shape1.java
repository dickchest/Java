package JavaProfessionalCourse.Lesson2_extendtion;

public abstract class Shape1 {
    protected int size;
    String color;

    public Shape1(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Shape1() {
//        System.out.println(this);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void draw();

    protected void printSize() {
        System.out.printf("size is %d%n", size);
    }
}

