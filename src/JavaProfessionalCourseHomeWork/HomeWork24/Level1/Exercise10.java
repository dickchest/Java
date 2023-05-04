package JavaProfessionalCourseHomeWork.HomeWork24.Level1;
/*
10. Считайте файл [результаты матчей](data/matches.txt)(из домашней работы 22) загрузите файл в строку(можно построчно считывать),
и найдите в нем все названия команд, которые состоят из двух слов
 */
import JavaProfessionalCourse.Lesson24_Regex.Parent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10 {
    public static void main(String[] args) {
        String fileName = "data/matches.txt";
        String fullString = "";
        StringBuilder tmpString = new StringBuilder(fullString);

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))
        ) {
            String stringLine;
            while ((stringLine = bufferedReader.readLine()) != null) {
                tmpString.append(stringLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        fullString = tmpString.toString();

        // осуществляем поиск
        String strPattern = "\\b\\w+ \\w+\\b";
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(fullString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
