package BookComputerScience.HomeWork;

/*
Дуга большого круга. Напишите программу G r e a t C ir c le ,  которая получает
четыре значения типа d ou ble x l, y l, х2 и у2 в аргументах командной строки (широта
и долгота в градусах двух точек земной поверхности) и выводит расстояние дуги
большого круга между этими точками. Расстояние дуги большого круга (в морских
милях) задается следующей формулой:
d = 60 arcco s^ in ^ ) sin(x2) + cos(Xj) cos(x2) cos(z/1 -  г/2)).
Обратите внимание:  в формуле используются градусы, а тригонометрические
функции Java работают с радианами.  Используйте методы M a t h .t o R a d ia n s ( )
и M a th .to D e g r e e s Q   для преобразования между угловыми единицами.  Исполь­
зуйте свою программу для вычисления расстояния по дуге большого круга между
Парижем (48,87° N и -2,33° W ) и Сан-Франциско (37,8° N и 122,4° W).
 */
public class HomeWork1_2_33 {
    public static void main(String[] args) {
        double x1 = Math.toRadians(48.87);
        double y1 = Math.toRadians(2.33);
        double x2 = Math.toRadians(37.8);
        double y2 = Math.toRadians(122.4);

        double d = 60 * Math.toDegrees(Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        System.out.println(d);
    }
}
