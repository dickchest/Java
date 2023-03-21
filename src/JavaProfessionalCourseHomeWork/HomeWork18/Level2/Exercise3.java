package JavaProfessionalCourseHomeWork.HomeWork18.Level2;

import java.util.function.Function;

public class Exercise3 {
    public static void main(String[] args) {
        Function<String, String> upperCase = Exercise3::firstLetterCapitalized;

        System.out.println(upperCase.apply("hello"));

    }
    public static String firstLetterCapitalized(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
