package JavaCourse.Lesson6;

public class LessonSixTwo {
    public static void main(String[] args) {
        int a = 1, b= 2, c = 2, d = 0;

        // AND
        if ((a<b) && (b==c)) {
        d = a + b+ c;
        System.out.println("this sum is: " + d);
        } else {
            System.out.println("False condition");
        }

        System.out.println(true && true);
        System.out.println(true & true);
        System.out.println(true | true);
        System.out.println(true ^ false);
        System.out.println(!(true) && true);
        System.out.println(true || false);
        System.out.println(false && true);
        System.out.println(false == true);
        System.out.println(true != false);


        boolean a1 = true || false;
        boolean b1 = false ^ true;
        boolean c1 = true != false;
        boolean d1 = false | true;
        boolean e1 = true & true;

        if (a1&&b1&&c1&&d1&&e1) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        // if ((a || b) && !(c && d && e && 3 == 1))

    }
}
