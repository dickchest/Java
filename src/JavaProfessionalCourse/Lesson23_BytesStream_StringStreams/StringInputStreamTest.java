package JavaProfessionalCourse.Lesson23_BytesStream_StringStreams;

import java.io.*;

public class StringInputStreamTest {

    public static void main(String[] args) {

        int current = 0;
        long before = System.currentTimeMillis();
        String str = "test";
        // без буфера = 460
        // можно вкладывать стримы друг в друга
        try (InputStream is = new BufferedInputStream(
                     new FileInputStream("C:\\Temp\\java_project\\HomeWork1\\Lesson3\\data\\matches.txt"));
             OutputStream os = new BufferedOutputStream(
                     new FileOutputStream("C:\\Temp\\java_project\\HomeWork1\\Lesson3\\names2.txt"));
                ) {
            while (is.available() > 0) {
                os.write(is.read());
            }
        } catch (IOException e) {
            System.out.println("error");
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis() - before);
        // обязательно нужно закрывать input стрим

    }
}
