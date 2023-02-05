package BookComputerScience.HomeWork;

/*
1.2.27.  Случайные числа с гауссовским (нормальным) рас­
пределением.  Напишите программу Random Gaussian  для вывода случайного чис­
ла г из гауссовского распределения. Для этого можно воспользоваться формулой
Бокса — Мюллера
г = sin(2 пи v) (-2  In u)1/2,
где u и v — вещественные числа в диапазоне от 0 до  1, сгенерированные методом
Math.random().
 */
public class HomeWork1_2_27 {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        double r = Math.sin(2*Math.PI*v)*Math.pow(-2*Math.log(u),1/2);
        System.out.println(r);
    }
}
