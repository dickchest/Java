package JavaProfessionalCourse.Lesson3_Interface.Enum;

import java.util.Scanner;

public class MonthTest {
    public static void main(String[] args) {
        Month[] values = Month.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            System.out.println(values[i].ordinal());
        }

        Scanner scanner = new Scanner(System.in);
        Month month = Month.valueOf(scanner.nextLine());
        System.out.println(month);

        Month month1 = Month.APRIL;
        switch (month1) {
            case MAY -> System.out.println("dlk");
            case JUNE -> System.out.println("lll");
            default -> System.out.println("no");
        }
    }
}
