package JavaCourse.Lesson4;

public class Cat {
    private int age;
    private String colour;

    public Cat() {
        this.age = 3;
        this.colour = "grey";
    }

    public Cat(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Cat(String colour) {
        this.age = 3;
        this.colour = colour;
    }
}
