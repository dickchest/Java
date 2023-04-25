package JavaProfessionalCourse.Lesson23_BytesStream_StringStreams;

import JavaProfessionalCourse.Lesson22_Input_Output.MatchResult;

import java.io.*;

public class StateReader {
    public static void main(String[] args) {
        try (ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("names-3.txt")
        )) {
            MatchResult result = (MatchResult) is.readObject();
            System.out.println(result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
