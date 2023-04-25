package JavaProfessionalCourseHomeWork.HomeWork23.Level2;

import java.io.*;

/*
4. Создайте файл и запишите туда строку `Привет мир` с помощью `FileInputStream` и метода readAllBytes
считайте все байты в массив байтов
   - возьмите `ByteArrayInputStream` и считайте все байты из массива, запишите результат в другой файл
 */
public class Exercise4 {
    public static void main(String[] args) {

        // создаем файл
        File inputFile = new File("data/tmp/inExercise4.txt");
        File outputFile = new File("data/tmp/outExercise4.txt");
        String text = "Привет мир";

        try (
                PrintStream ps = new PrintStream(new FileOutputStream(inputFile));
        ) {
            ps.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // считываем все байты из файла
        byte[] bytes = null;
        try (
                InputStream inputStream = new FileInputStream(inputFile)
        ) {
            bytes = inputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // записываем все байты в другой файл
        try (
                InputStream byteInputStream = new ByteArrayInputStream(bytes);
                OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            byte[] data = byteInputStream.readAllBytes();
            outputStream.write(data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
