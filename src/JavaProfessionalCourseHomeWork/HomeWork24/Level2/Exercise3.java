package JavaProfessionalCourseHomeWork.HomeWork24.Level2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Дан [файл](data/test-data.json). C посощью регулярных выражений найдите
   - Названия всех `boolean` переменных
   - Версию приложения (версия - любое число, находится в поле version)
   - Все поля (поле - строка, которая начинается с `{` и заканчивается `}`), в названии которых есть слово `normalizer`
 */
public class Exercise3 {
    public static void main(String[] args) {
        String fileName = "data/test-data.json";
        String json;
        try {
            json = Files.readString(Paths.get(fileName));
            System.out.println(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // поиск названий всех булеан переменных
        Pattern booleanPattern = Pattern.compile("\\\"([a-zA-Z0-9_\\.]*)\\\":\\s(true|false)");
        Matcher booleanMatcher = booleanPattern.matcher(json);
        while (booleanMatcher.find()) {
            System.out.println("Boolean variable name = "+booleanMatcher.group(1));
        }

        // поиск версий приложения
        Pattern versionPattern = Pattern.compile("\\s\"version\":\\s*(\\d+)");
        Matcher versionMatcher = versionPattern.matcher(json);
        while (versionMatcher.find()) {
            System.out.println("Version = "+versionMatcher.group(1));
        }

        // поиск всех полей с normalizer
        Pattern normalizerPattern = Pattern.compile("\\s*\"([\\w\\._]*normalizer[\\w\\._]*)\":\\s*\\{([^\\{\\}]*)\\}");
        Matcher normalizerMatcher = normalizerPattern.matcher(json);
        while (normalizerMatcher.find()) {
            System.out.println("Normalizer: "+normalizerMatcher.group(1));
            System.out.println("Field: "+normalizerMatcher.group(2));
        }

    }
}
