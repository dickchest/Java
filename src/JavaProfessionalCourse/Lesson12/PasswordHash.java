package JavaProfessionalCourse.Lesson12;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class PasswordHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest("rustam".getBytes(StandardCharsets.UTF_8));
        byte[] resultFromUser = mDigest.digest("rustam".getBytes(StandardCharsets.UTF_8));

        System.out.println(Arrays.equals(result, resultFromUser));

        System.out.println(new String(result, StandardCharsets.UTF_8));
    }
}
