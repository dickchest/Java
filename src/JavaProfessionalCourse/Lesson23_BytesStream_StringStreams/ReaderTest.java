package JavaProfessionalCourse.Lesson23_BytesStream_StringStreams;

import java.io.*;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
//        try (Reader reader = new FileReader("names.txt");
        try (Reader reader = new InputStreamReader(new FileInputStream("names.txt"));
             Writer writer = new FileWriter("names-3.txt")
        ) {
            int i;
            String str = "";

            while ((i = reader.read()) != -1) {
//                System.out.println((char) i);
                str += (char) i;
                writer.write(i);
            }
            System.out.println(str);
        }

        PrintStream os = new PrintStream(new FileOutputStream("1.txt"));
        os.println("tysdlfj");



    }
}
