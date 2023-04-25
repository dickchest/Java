package JavaProfessionalCourse.Lesson23_BytesStream_StringStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class BufferInputStreamTest {

    public static void main(String[] args) {

        int current = 0;
        long before = System.currentTimeMillis();

        try (InputStream is = new BufferedInputStream(new FileInputStream("C:\\Temp\\java_project\\HomeWork1\\Lesson3\\data\\matches.txt"))){
            while (is.available() > 0) {
                current = is.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis() - before);
        // обязательно нужно закрывать input стрим
    }
}
