package BookComputerScience.HomeWork;

//1.2.2.  Напишите программу, которая использует M ath.sin()  и Math.cos()  и про­
//        веряет, что значение cos20 + sin20 равно приблизительно 1 для любого значения 0,
//        переданного в аргументе командной строки.  Просто выведите значение.  Почему
//        оно не всегда в точности равно 1?

public class HomeWork1_2_3 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        System.out.println(!(a && b));
        System.out.println(!(a && b) && (a || b));
    }
}
