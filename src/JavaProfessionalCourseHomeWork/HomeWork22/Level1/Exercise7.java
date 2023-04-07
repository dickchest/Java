package JavaProfessionalCourseHomeWork.HomeWork22.Level1;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/*
7. Напишите программу, которая будет создавать и писать в файл какое-нибудь стихотворение
 */
public class Exercise7 {
    public static void main(String[] args) {
        File file = new File("poem.txt");
        String poem = "В лесу родилась елочка\n" +
                "В лесу она росла\n" +
                "Зимой и летом стройная\n" +
                "Зеленая была";
        try {
            System.setOut(new PrintStream(file));
            file.createNewFile();
            System.out.print(poem);

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл.");
            e.printStackTrace();
        }

    }
}
