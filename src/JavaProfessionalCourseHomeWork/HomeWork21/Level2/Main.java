package JavaProfessionalCourseHomeWork.HomeWork21.Level2;
/*
1. Нужно написать class DayInMonthValidator с методом validate, который будет принимать 2 числа номер месяца и число
- месяцы должны быть в промежутке между 1 и 12, иначе выкинуть ошибку, что номер месяца невалидный
- количество дней в месяце зависит от номера месяца (считаем что в феврале всегда 28 дней), если больше или меньше 0,
выкинуть какой-нибудь созданный свой Exception
2. Возьмите предыдущий пример и выкидывайте экспешен с информацией, что пришло на вход и что является допустим значением
 */
public class Main {
    public static void main(String[] args) throws Exception {
        DayInMonthValidator.validate(12, 4);
        DayInMonthValidator.validate(2, 29);
        DayInMonthValidator.validate(0, 5);
        DayInMonthValidator.validate(3, 32);
    }
}
