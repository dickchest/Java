package JavaProfessionalCourseHomeWork.HomeWork18.Level1;

import java.util.function.Function;

/*
10. Будет сначала добавлять к входной строке Test, после будет обрезать строку с 0 по 3 символ, потом будет добавлять в конец .
 */
public class Exercise10 {
    public static void main(String[] args) {
        Function<String, String> addStringTest = s -> s + "Test";
        Function<String, String> subString = s -> s.substring(0,3);
        Function<String, String> addToTheEnd = s -> s + ".";


        System.out.println(addStringTest.andThen(subString).andThen(addStringTest).apply("Hello, world!"));
    }
}
