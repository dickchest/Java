package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.3.2. Напишите более универсальную и надежную версию программы Q u a d ra tic
(листинг 1.2.3), которая выводит корни многочлена ах? + Ьх + с> либо соответству­
ющее сообщение, если дискриминант отрицателен, при этом избегая деления на
нуль, если значение а равно нулю.
 */
public class HomeWork1_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x1, x2;

        // count discriminant
        if (a != 0) {
            double discriminant = (b * b) - (4 * a * c);

            if (discriminant < 0) System.out.println("Корней нет");
            else {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println(x1 + " and " + x2);
            }
        } else { // if (a==0)
            x1 = -c / b;
            System.out.println(x1);
        }
    }
}
