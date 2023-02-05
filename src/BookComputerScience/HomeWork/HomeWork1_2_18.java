package BookComputerScience.HomeWork;
/*
1.2.18. Напишите программу, которая получает два числа с плавающей точкой х и у
в аргументах командной строки и выводит евклидово расстояние от точки  (х,  у)
до точки (0,0).
 */
public class HomeWork1_2_18 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double d = Math.sqrt(x*x + y*y);
        System.out.println(d);
    }
}
