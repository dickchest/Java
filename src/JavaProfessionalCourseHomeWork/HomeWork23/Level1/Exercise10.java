package JavaProfessionalCourseHomeWork.HomeWork23.Level1;
/*
10. Напишите метод, который будет записывать строку в файл,
подумайте что лучше использовать в этом случае (OS vs Writer)
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exercise10 {

    public static void writeToFile(String filePath, String string) throws IOException {
        try (
                Writer writer = new FileWriter(filePath)
        ) {
            writer.write(string);
        }
    }

    public static void main(String[] args) throws IOException {
        String filePath = "data/tmp/2.txt";
        String string = "askldfjasklfjlkasdjfklasjf lksdjfklajf";
        writeToFile(filePath, string);
    }
}
