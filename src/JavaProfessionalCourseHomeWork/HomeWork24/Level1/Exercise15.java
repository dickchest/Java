package JavaProfessionalCourseHomeWork.HomeWork24.Level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
14. Есть строка `01111000201010101701`. С помощью регулярного выражения проверьте является ли данная строка двиочным представлением
(двичное счисло может содержать только 1 и 0), если есть ошибка верните индексы, где они встретились
 */
public class Exercise15 {
    public static void main(String[] args) {
        String str = "01111000201010101701";
        Pattern pattern = Pattern.compile("[^01]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}
