package JavaProfessionalCourseHomeWork.HomeWork23.Level1;
/*
9. Напишите метод, который будет считывать с файла строку,
подумайте что лучше использовать в этом случае (IS vs Reader)
 */

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exercise9 {
    public static void main(String[] args) throws IOException {
        try (
                Reader reader = new FileReader("data/matches.txt")
        ) {
            String str = "";
            int i;

            while ((i = reader.read()) != '\n') {
                str += (char) i;
            }
            System.out.println(str);
        }
    }
}
