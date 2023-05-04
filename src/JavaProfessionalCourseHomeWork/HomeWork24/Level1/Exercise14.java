package JavaProfessionalCourseHomeWork.HomeWork24.Level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
14. В строке `Carrot Collapse /\ Criteria, Avatar. Sort][Cabbage` нужно найти позиции небуквенных символов
 */
public class Exercise14 {
    public static void main(String[] args) {
        String str = "Carrot Collapse /\\ Criteria, Avatar. Sort][Cabbage";
        String patternString = "\\W";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}
