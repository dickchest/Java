package JavaProfessionalCourseHomeWork.HomeWork23.Level2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
3. Считайте дынные из файла в массив байтов(считывайте с помощью read,
который считывает не по одному элементу, а сразу пачку данных, распечатайте в консоль результат)
 */
public class Exercise3 {
    public static void main(String[] args) {
        File inputFile = new File("data/matches.txt");

        try (
                InputStream inputStream = new FileInputStream(inputFile)
        ) {
            byte[] buffer = new byte[1024];
            while (inputStream.read(buffer) != -1) {
                String text = new String(buffer, 0, buffer.length);
                System.out.print(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
