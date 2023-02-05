package BookComputerScience;

// вывод двоичного представления числа n
public class Listing1_3_7 {
    public static void main(String[] args) {
        int n = 74;
        int power = 1;
        while (power <= n / 2)
            power = 2 * power;
        System.out.println(power);
            // теперь повер содержит наибольшую степень 2 меньше или равно Н
        while (power > 0) { // вывод степеней 2 по убыванию
            if (n < power) {
                System.out.print(0);
            } else {
                System.out.print(1);
                n -= power;
            }
            power /=2;
        }
        System.out.println();
    }
}
