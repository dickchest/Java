package JavaProfessionalCourseHomeWork.HomeWork24.Level2;

import JavaProfessionalCourse.Lesson24_Regex.Parent;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. Из файла с результатом матчей попробуйте создать регулярное выражение, которому соответствует каждая строка
 */
public class Exercise1 {
    public static void main(String[] args) {

        String fileName = "data/matches.txt";
        String fileData;

        try {
            fileData = new String(Files.readAllBytes(Paths.get(fileName)));
//            System.out.println(fileData);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        String stringPattern = "(\\d{4}), (\\d+), (\\d+), (.+),\\s(\\d+:\\d+), (.+), (\\d+|NULL), (NULL|.+)";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(fileData);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
