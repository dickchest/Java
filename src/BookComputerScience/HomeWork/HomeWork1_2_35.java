package BookComputerScience.HomeWork;

import java.util.Scanner;

/*
1.2.35. Кривая дракона. Напишите программу, которая выводит инструкции для
рисования кривых дракона разного порядка, от 0 до 5. Инструкции выглядят как68  Глава 1. Основы программирования
цепочки символов F, L и R, где F означает «нари­
совать линию на 1 единицу вперед», L — «повер­
нуть налево», a R — «повернуть направо». Чтобы
получить кривую дракона порядка п, сложите
полоску бумаги пополам п раз, а затем разверни­
те с прямыми углами. Чтобы решить эту задачу,
заметим, что кривая порядка п является кривой
порядка п -   1, за которой следует инструкция L
и кривая порядка п -   1, обходимая в обратном
порядке (далее аналогичное описание строится
для обратной кривой).
 */
public class HomeWork1_2_35 {
    public static void main(String[] args) {
        String n0 = "F";
        String b0 = "F";

        String n1 = n0 + "L" + b0;
        String b1 = n0 + "R" + b0;

        String n2 = n1 + "L" + b1;
        String b2 = n1 + "R" + b1;

        String n3 = n2 + "L" + b2;
        String b3 = n2 + "R" + b2;

        String n4 = n3 + "L" + b3;
        String b4 = n3 + "R" + b3;

        String n5 = n4 + "L" + b4;
        String b5 = n4 + "R" + b4;

        System.out.println(n0);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }
}
