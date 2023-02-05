package JavaCourse.Lesson6;

public class LessonSeven {
    public static void main(String[] args) {
        boolean thisVariableIsBoolean = true;
        boolean thisVariableIs;
        boolean shouldBeTrue = Boolean.parseBoolean("false");

        // ==
        int var1 = 5, var2 = 10, var3 = 5;
        System.out.println("var1 == var2: " + (var1 == var2));
        System.out.println("var1 == var3: " + (var1 == var3));

        boolean isEqual = (5 == 5);
        System.out.println(isEqual);

        // != не равно
        System.out.println("var1 != var2: " + (var1 != var2));
        System.out.println("var1 != var3: " + (var1 != var3));

        // больше >
        var1 = 30;
        var2 = 20;
        var3 = 5;

        System.out.println("var1 > var2: " + (var1 > var2));
        System.out.println("var3 > var1: " + (var3 > var1));

        // меньше <
        var1 = 10;
        var2 = 20;
        var3 = 5;

        System.out.println("var1 < var2: " + (var1 < var2));
        System.out.println("var2 < var3: " + (var2 < var3));

        // больше или равно >=
        var1 = 20;
        System.out.println("var1 >= var2: " + (var1 >= var2));
        System.out.println("var3 >= var1: " + (var3 >= var1));

        // меньше или равно <=
        System.out.println("var1 <= var2: " + (var1 <= var2));
        System.out.println("var2 <= var3: " + (var2 <= var3));


    }
}
