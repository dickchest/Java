package JavaProfessionalCourseHomeWork.HomeWork24.Level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
11. Напишите программу, которая используя регулярные выражения будет проверять пароль на надежность:
    - хотя бы 1 символ латинского алфавита в нижнем регистре
    - хотя бы 1 символ латинского алфавита в верхнем регистре
    - хотя бы 1 символ числа
    - хотя бы 1 символ `!"#$%&'()*+,-./:;<=>?@[\]^_{|}~`
    - длина не меньше 8 символов
 */
public class Exercise11 {
    public static void main(String[] args) {
        String password = "kdjfaSsfj1!/";

        String stringPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_{|}~])[A-Za-z0-9)!\"#$%&'()*+,-./:;<=>?@\\[\\]^_{|}~]{8,}$";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find());
    }
}
