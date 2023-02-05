package StartBasicLessons;

public class Lesson17Methods {
    public static void squar(int value) {
        int result = value * value;
        System.out.println(result);
    }

    public static Integer sqr(int value) {
        int result = value * value;
        return result;
    }

    public static void main(String[] args) {
        squar(12);
        squar(5);
        System.out.println(sqr(12) + sqr(5));
    }
}
