package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_3_junior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x = null;
        while (x == null) {
            System.out.println("Введите целое число");
            try {
                x = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести целое число!");
                scanner.nextLine();
            }
        }
        System.out.println(x);

    }
}
