package JavaCourse.Lesson7;

public class LessonAcht1 {
    public static void main(String[] args) {
        String name = "John1";
        if (name.equals("John")) {
            System.out.println("Hi John");
        } else {
            System.out.println("You're not John, aren't you");
        }

        boolean iamRight = true;
        if (iamRight) {
            System.out.println("iam true");
        } else {
            System.out.println("I'm wrong, oh no!");
        }

        // if вложенные
        name = "John1";
        String gender = "male";

        if (gender.equals("male")) {
            if (name.equals("John")) {
                System.out.println("Hello John, you are male!");
            } else {
                System.out.println("You are not John, unknown male!");
            }
        } else {
            System.out.println("You're female!");
        }

        // if else if ladder
        // else if
        name = "stephen1";
        if (name.equals("mary")) {
            System.out.println("Hello, Mary");
        } else if (name.equals("stephen")) {
            System.out.println("Hello, Steven");
        } else if (name.equals("John")) {
            System.out.println("Hello John");
        } else {
            System.out.println("Hello person!");
        }

    }
}
