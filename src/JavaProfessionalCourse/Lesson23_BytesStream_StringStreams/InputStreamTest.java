package JavaProfessionalCourse.Lesson23_BytesStream_StringStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamTest {

    public static void main(String[] args) {

        int current = 0;
        long before = System.nanoTime();
        byte[] buffer = new byte[32];

        try (InputStream is = new FileInputStream("C:\\Temp\\java_project\\HomeWork1\\Lesson3\\names.txt")){
            while (is.available() > 0) {
                current = is.read(buffer);
                System.out.println(current);
                String str = new String(buffer, Charset.defaultCharset());
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.nanoTime() - before);
        // обязательно нужно закрывать input стрим
    }
}
