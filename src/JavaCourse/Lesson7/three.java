package JavaCourse.Lesson7;

public class three {
    public static void main(String[] args) {
        System.out.println("main started");
        foo1();
        System.out.println("main ended");
    }

    public static void foo1() {
        System.out.println("foo1 started");
        foo2();
        System.out.println("foo1 endedd");
    }

    public static void foo2() {
        System.out.println("foo2 started");
        if (true) return;
        System.out.println("foo2 endeed");
    }
}
