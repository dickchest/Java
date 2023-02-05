package BookComputerScience.HomeWork;
/*
1.2.22.  Напишите программу, которая получает числа типа double х0, v0 и t  в ар­
гументах командной строки и выводит значение х0 + v0t - g  t2/ 2, где g — константа
9,80665. (Примечание: значение определяет путь в метрах, пройденный за t секунд
брошенным вертикально вверх объектом, из исходной позиции х0 со скоростью
v0 метров в секунду.)
 */
import java.lang.invoke.ConstantBootstraps;
import java.util.Scanner;

public class HomeWork1_2_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double v = scanner.nextDouble();
        double t = scanner.nextDouble();

        final double G = 9.80665;
        System.out.printf("%.2f m/c = %.2f km/h\n", v, v*3600);
        System.out.println(x + v*t - (G*t*t)/2);
    }
}
