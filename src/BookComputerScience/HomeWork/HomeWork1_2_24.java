package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.2.24. Капитализация процентов. Напишите программу, которая вычисляет и вы­
водит сумму, которую вы получите через  t   лет при размещении  Р  долларов под
ежегодный процент г (непрерывно начисляемый). Искомое значение вычисляется
по формуле Рe^rt
 */
public class HomeWork1_2_24 {
    public static void main(String[] args) {
        int t = 5;
        int p = 1_000_000;
        double r = 3;
//        double sum = p* Math.exp(r*t);
        double sum = p*Math.pow (1+r/100, t);
        System.out.printf("= %.2f", sum);
    }
}
