package JavaCourse.Lesson7;

public class Five {
    public static void main(String[] args) {
        String gender = "male";

        boolean isMale = gender.equals("male") ? true : false;
        System.out.println(isMale);

        if (gender.equals("male")) isMale = true;
                else isMale = false;
        System.out.println(isMale);
    }
}
