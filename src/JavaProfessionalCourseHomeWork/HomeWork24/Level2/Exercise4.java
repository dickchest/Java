package JavaProfessionalCourseHomeWork.HomeWork24.Level2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4. Дан [файл](data/test-data.xml) (похоже на реальный пример данных, который отправляет сторонний сервис), с помощью регулярных выражений нужно получить:
   - Название всех типов(`sf:type`)
   - Id всех `PermissionSetAssignment`
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {
        String fileName = "data/test-data.xml";
        String json = new String(Files.readAllBytes(Paths.get(fileName)));

        System.out.println("Название всех типов(`sf:type`)");
        Pattern sfPattern = Pattern.compile("<sf:type>(\\w+)<");
        Matcher sfMatcher = sfPattern.matcher(json);
        while (sfMatcher.find()) {
            System.out.println(sfMatcher.group(1));
        }

        System.out.println("------");
        System.out.println("Id всех `PermissionSetAssignment`");
        Pattern idPattern = Pattern.compile("<sf:type>PermissionSetAssignment[\\w\\W]*?Id>(\\w+)<");
        Matcher idMatcher = idPattern.matcher(json);
        while (idMatcher.find()) {
            System.out.println(idMatcher.group(1));
        }
    }
}
