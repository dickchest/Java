package JavaProfessionalCourse.Lesson19_StreamAPI_primitiveStreams.RepeatHW18;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class Exercise11 {
    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier iSup = () -> random.nextInt();
        DoubleSupplier dSup = random::nextDouble;
    }
}
