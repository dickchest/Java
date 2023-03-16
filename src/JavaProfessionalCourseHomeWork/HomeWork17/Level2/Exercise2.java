package JavaProfessionalCourseHomeWork.HomeWork17.Level2;

/*
Напишите формулу для подсчета площади по трем переменным - формулы Герона.
 Функиця должна принимать только 3 параметра a,b,c -стороны треугольника
 Например для 3,4,5 ответ должен быть 6 P.S корень Math.sqrt(...)
 */
public class Exercise2 {
    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Double> function = (a, b, c) -> {
            double p = 0.5* (a + b + c);
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        };

        System.out.println(function.apply(3, 4, 5));
    }
}
