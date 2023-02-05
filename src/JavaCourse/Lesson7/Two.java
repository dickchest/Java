package JavaCourse.Lesson7;

public class Two {
    public static void main(String[] args) {
        // области видимости

        boolean isTrue = true;
        boolean isTure2 = true;
        int h = 0;

        if(isTrue) {
            System.out.println("is true");
        } else if (isTure2) {
            System.out.println("is true 2");
        } else {
            System.out.println("false");
        }
//        System.out.println(h);
returnString();

    }

    private static void returnString() {
        if (true) {
            System.out.println(1);
            if (true) {
                System.out.println(2);
            }
            System.out.println(3);
            return;
        }
        System.out.println(4);
    }
}
