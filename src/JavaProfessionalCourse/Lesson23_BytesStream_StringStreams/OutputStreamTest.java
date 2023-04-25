package JavaProfessionalCourse.Lesson23_BytesStream_StringStreams;

import JavaProfessionalCourse.Lesson22_Input_Output.MatchResult;

import java.io.*;

public class OutputStreamTest {
    public static void main(String[] args) {
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("names-3.txt")
        )) {
            os.writeObject(new MatchResult("Berlin Stutgart 1-1"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
