package JavaProfessionalCourseHomeWork.HomeWork24.Level1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
12. Заполните данные из файла в одну строку (используйте StringBuilder)
 */
public class Exercise12 {
    public static void main(String[] args) {
        String fileName = "data/matches.txt";
        StringBuilder stringBuilder = new StringBuilder();
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))
        ) {
            String stringLine;
            while ((stringLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(stringLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder.toString());

    }
}
