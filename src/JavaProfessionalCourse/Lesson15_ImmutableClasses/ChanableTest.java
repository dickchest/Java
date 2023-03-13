package JavaProfessionalCourse.Lesson15_ImmutableClasses;

public class ChanableTest {
    public static void main(String[] args) {
        NonChangableClass nonChangableClass = new ChangableClass(1, "my password");

        ///

        String testStr = "I love very much";
        String replaceStr = testStr.replace('o', 'a');
        System.out.println(replaceStr);

        final String testS = "test String";
        testStr = "another string";
//        testS = "different text";

        // immutable - не изменяемые классы

    }
}
