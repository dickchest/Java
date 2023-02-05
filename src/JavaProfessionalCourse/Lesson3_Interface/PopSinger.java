package JavaProfessionalCourse.Lesson3_Interface;

public class PopSinger extends Person implements Jumpable, Singable {
    @Override
    public void jump() {
        System.out.println("I can jump");
    }

    @Override
    public void jump(int high) {
        System.out.println("I can jump " + high);
    }

    @Override
    public void sing() {
        System.out.println("I thing Pop song");
    }
}
