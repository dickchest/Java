package JavaProfessionalCourseHomeWork.HomeWork12.Level2.Exercise1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class UserService {
    private HashMap<String, String> users;

    public UserService() {
        users = new HashMap<>();
    }

    public User signUp(String login, String password) throws NoSuchAlgorithmException {
        // проверяем, если user уже существуйте
        if (users.containsKey(login)) {
            System.out.println("User already exist");
            return null;
        }

        // проверяем, что пароль надежный
        if (!isStrongPassword(password)) {
            return null;
        }

        // хэшируем пароль и сохраняем пользователя в хеш-мапе
        String hashedPassword = hashPassword(password);
        User user = new User(login);
        users.put(user.getLogin(), hashedPassword);

        return user;
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(password.getBytes(StandardCharsets.UTF_8));
        return new String(result, StandardCharsets.UTF_8);
    }


    public boolean isStrongPassword(String password) {

        // проверяем, что длина больше 8
        if (password.length() <= 8) {
            System.out.println("Length should be more then 8 characters");
            return false;
        }

        // проверка на наличие большой буквы
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("There should be 1 or more uppercase characters");
            return false;
        }

        // проверка на наличие запрещенных символов
        String wrongCharacters = "!@#$%^&*()_+";
        for (char x : wrongCharacters.toCharArray()) {
            if (password.indexOf(x) != -1) {
                System.out.println("No such characters as '!@#$%^&*()_+' are excepted");
                return false;
            }
        }

        return true;
    }

    public String signIn(String login, String password) throws NoSuchAlgorithmException {
        String hashedPassword = users.get(login);

        if (hashedPassword != null && hashedPassword.equals(hashPassword(password))) {
            System.out.println("Login successful. Hello " + login);
            return login;
        }
        System.out.println("Access denied");
        return null;
    }
}
