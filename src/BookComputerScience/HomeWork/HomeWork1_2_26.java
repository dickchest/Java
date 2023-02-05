package BookComputerScience.HomeWork;

/*
1.2.26.  Полярные координаты. Напишите программу, кото­
рая преобразует декартовы координаты в полярные.  Ваша
программа должна получать два числа типа d o u b le   в аргу­
ментах командной строки и выводить полярные координаты
г и 0. Используйте метод Math.atan2(y,  х) для вычисления
арктангенса величины у/х в диапазоне от -к  до к.
 */
public class HomeWork1_2_26 {
    public static void main(String[] args) {
        double x = 5;
        double y = 1;
        double radius, angel;
        radius = Math.sqrt(x*x + y*y);
        angel = Math.atan(y/x);
        System.out.printf("улог = %.2f\n", Math.toDegrees(angel));
        System.out.printf("радиус = %.2f\n", radius);

    }
}
