package JavaProfessionalCourse.Lesson5;

public class testclass {

    public static enum Side {
        LEFT, RIGHT, UP, DOWN
    }

    public static void main(String[] args) {
        System.out.println(Side.LEFT.ordinal());
        System.out.println(Side.RIGHT.ordinal());
    }
}
