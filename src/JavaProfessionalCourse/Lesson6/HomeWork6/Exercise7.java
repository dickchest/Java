package JavaProfessionalCourse.Lesson6.HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
    /*
    7. Введите с клавиатуры в List пять значений Integer.
    Выведите их в одну строку через запятую. Получите для List среднее арифметическое.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\n]");
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int number = 0;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            list.add(x);
            sum += x;
            number++;
        }
        System.out.println(list);
        System.out.println(number);
        System.out.println(sum);
        System.out.println(1.0 * sum / number);
    }
}
