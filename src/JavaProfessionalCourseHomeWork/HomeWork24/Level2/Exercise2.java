package JavaProfessionalCourseHomeWork.HomeWork24.Level2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Напишите проверку email на валидность мы не гонимся здесь за оригинальным стандартом (если интересно, то вот [стандарт](http://www.ex-parrot.com/~pdw/Mail-RFC822-Address.html)),
наша задача сделать простую проерку
   - Имя email может содержать буквы и цифры латинского алфавита (максимум 30) и точку
   - После идет `@`
   - После может быть буквы, цифры и точка
   - После идет точка и от 2 до 4 символов
P.S. будьте внимательны с символом точка
 */
public class Exercise2 {
    public static void main(String[] args) {
        String email = "di1c.kchest@gma.il.com";
        String patternString = "^[a-zA-Z0-9\\.]{1,30}@([a-zA-Z0-9\\.]+)\\.\\w{2,4}$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
