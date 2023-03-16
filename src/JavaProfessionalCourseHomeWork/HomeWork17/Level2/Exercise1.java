package JavaProfessionalCourseHomeWork.HomeWork17.Level2;

import java.util.function.Function;
/*
Напишите с помощью лямбда выражений следующие формулы и вызовите их на числе 5
P.S возведение в степень Math.pow(<число>,<степень>)
P.P.S функция возвращает не целочисленный результат
 */
public class Exercise1 {
    public static void main(String[] args) {

        Function<Integer, Double> function1 = x -> Math.pow(x, 2.0) / 2.0 - 2.0*x / 3.0 - (x-2.0) / 6.0;
        Function<Integer, Double> function2 = x -> Math.pow((x - 1.0 / x), 1.0/2.0) + Math.pow((1.0 - 1.0 / x), 0.5);
        Function<Integer, Double> function3 = x -> Math.sqrt(3*x - 1) + Math.pow((1 + x),2);

        int argument = 5;

        System.out.println(function1.apply(argument));
        System.out.println(function2.apply(argument));
        System.out.println(function3.apply(argument));





    }
}
