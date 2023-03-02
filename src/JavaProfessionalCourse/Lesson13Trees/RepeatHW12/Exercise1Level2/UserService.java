package JavaProfessionalCourse.Lesson13Trees.RepeatHW12.Exercise1Level2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    Map<String, User> users = new HashMap<>();


    public void signIn(String email, String password) throws NoSuchAlgorithmException {

        User user = users.get(email);
        if (user == null) {
            System.out.println("no such a user");
        }

        byte[] originalPassword = user.getPassword();
        byte[] enteredPassword = createHash(password);

        if (Arrays.equals(originalPassword, enteredPassword)) {
            System.out.println("all good");
        } else {
            System.out.println("password mismatch");
        }

    }


    private byte[] createHash(String pwd) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        return mDigest.digest(pwd.getBytes(StandardCharsets.UTF_8));

    }

    public void signUp(String email, String password) throws NoSuchAlgorithmException {

        User user = users.get(email);
        if (user != null) {
            System.out.println("client exist");
            return;
        }
//        Character.isUpperCase()
//        Character.isLowerCase()
//        Character.isDigit();
//        char[] specialChars = "!@#$#%".toCharArray();
//        specialChars.contains(c);
        byte[] pwd = createHash(password);
        users.put(email, new User(email, pwd));
    }
}
