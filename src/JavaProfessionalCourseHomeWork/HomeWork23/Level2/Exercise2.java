package JavaProfessionalCourseHomeWork.HomeWork23.Level2;

import java.io.*;
import java.nio.charset.Charset;

/*
2. Возьмите файл из предыдущей домашки и начните считывать его с 100 символа и считайте 200 символов,
запишите это в отдельный файл
 */
public class Exercise2 {
    public static void main(String[] args) {
        File inputFile = new File("data/matches.txt");
        File outputFile = new File("data/tmp/matchesOut.txt");
        int startPosition = 100;
        int readLength = 200;

        try (
                Reader reader = new FileReader(inputFile);
                Writer writer = new FileWriter(outputFile);
        ) {
            char[] buffer = new char[readLength];

            reader.skip(startPosition);
            int charsRead = reader.read(buffer);

            String text = new String(buffer, 0, charsRead);
            System.out.println(text);

            writer.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
