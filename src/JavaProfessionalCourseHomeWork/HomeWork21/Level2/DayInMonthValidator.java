package JavaProfessionalCourseHomeWork.HomeWork21.Level2;

public class DayInMonthValidator{
    public static void validate(int month, int day) throws Exception {
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (month < 1 || month > 12) {
            throw new Exception("Invalid month number " + month + ". Значение должно быть от 1 до 12");
        }

        int maxDays = daysInMonth[month];

        if (day < 1 || day > maxDays) {
            throw new IncorrectDayNumberException(
                    "Invalid day number " + day + " for month " + month
                            + ".Значение должно быть от 1 до " + maxDays);
        }
    }
}
