package BookComputerScience;
// высокосный год
public class Listing1_2_4 {
    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);
    }
}
