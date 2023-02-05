package BookComputerScience;

import java.util.Scanner;

public class Listing1_3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        for (long factor = 2; factor <= n/factor ; factor++) {
            // проверка потенциального множителя
            while (n % factor == 0) {
                // исключение и вывод множителя фактор
                n /= factor;
                System.out.print(factor + " ");
            } // любой множитель ен должен быть больше фактор
        }
        if (n > 1) System.out.print(n);
    }
}
