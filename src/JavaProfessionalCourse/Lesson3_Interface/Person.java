package JavaProfessionalCourse.Lesson3_Interface;

public class Person implements Jumpable{
    @Override
    public void jump() {
        System.out.println("I can jump");
    }

    @Override
    public void jump(int high) {
        System.out.println("I can jump at " + high);
    }
}
