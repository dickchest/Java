package JavaProfessionalCourseHomeWork.HomeWork24.Level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
13. Есть строка `Carrot Collapse /\ Criteria, Avatar. Sort][Cabbage`, необходимо написать регулярное выражение,
которое будет находить все слова начинающиеся на `C` и заканчивающийся на `t` или `e`
 */
public class Exercise13 {
    public static void main(String[] args) {
        String str = "Carrot Collapse /\\ Criteria, Avatar. Sort][Cabbage";
        String patternString = "\\bC\\w*?[te]\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
