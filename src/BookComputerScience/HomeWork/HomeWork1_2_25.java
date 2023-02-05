package BookComputerScience.HomeWork;

/*
Охлаждение под действием ветра. Для заданной температуры Т (по шкале
Фаренгейта) и скорости ветра v (в милях в час) Национальная метеорологическая
служба вычисляет фактическую температуру (охлаждение под действием ветра)
по формуле:
w = 35.74 + 0.6215 Г+ (0.4275 Т — 35.75) v°-16.
Напишите программу,  которая  получает два числа типа double  tem perature
и velocity в аргументах командной строки и выводит величину охлаждения. Для
вычисления ab используйте Math. pow(a,  b). Примечание: формула недействительна,
если абсолютное значение Т больше 50 или если v больше 120 или меньше 3 (пред­
полагается, что полученные значения лежат в этом диапазоне).
 */
public class HomeWork1_2_25 {
    public static void main(String[] args) {
        double temperature = 40;
        double velocity = 35;
        double w = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75)*Math.pow(velocity, 0.16);
        System.out.println("Temperature = " + temperature);
        System.out.println("Wind speed  = " + velocity);
        System.out.println("Wind chill  = " + w);
    }
}
