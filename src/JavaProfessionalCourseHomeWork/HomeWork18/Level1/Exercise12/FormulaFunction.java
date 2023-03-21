package JavaProfessionalCourseHomeWork.HomeWork18.Level1.Exercise12;

/*
Напишите Функциональный интерфейс для формул, Который принимает 4 параметра
Напишите реализацию этой функции для какой-нибудь формулы
 */

@FunctionalInterface
public interface FormulaFunction<A, B, C, D, R> {
    R calculate(A a, B b, C c, D d);
}
