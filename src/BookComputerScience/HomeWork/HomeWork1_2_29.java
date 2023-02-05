package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.2.29. День недели. Напишите программу, которая получает дату и выводит день
недели, на который приходится эта дата.  Ваша программа должна получать три
значения типа in t в аргументах командной строки: m (месяц), d (день) и у (год).
Значение m равно 1 для января, 2 — для февраля и т. д. Программа выводит 0 для
воскресенья,  1  — для понедельника, 2 — для вторника и т. д. Вычисление выпол­
няется по следующим формулам из григорианского календаря:
Уо = У ~ (1^ -  от) /  12
х  = У0 + Уо/4 ~Уо/Ю О + г/о/400
т 0 = m +  12 х ((14 -  /и) /  12) -  2
d0 = (d + х+ (31  х т0) /  12) % 7
 */
public class HomeWork1_2_29 {
    public static void main(String[] args) {
        int d = 7;
        int m = 10;
        int y = 2023;
        int y0 = y - (14-m)/12;
        int x = y0 + y0 / 4 - y0/100 + y0 / 400;
        int m0 = m + 12*((14-m)/12)-2;
        int d0 = (d + x+ (31*m0)/12) % 7;
        System.out.println(d0);
    }
}
