package JavaProfessionalCourseHomeWork.HomeWork12.Level2.Exercise1;

import java.security.NoSuchAlgorithmException;

/*
1. Напишите логику для регистрации пользователя для этого
- создайте класс UserService, который имеет метод signUp(...), который принимает логин и пароль и создает объект User
и сохраняет его в хеш мапу, если пользователь уже существует возвращайте null
- подумайте что делать с паролем пользователя, так как он должен храниться в зашифрованном виде
- так же сервис должен проверять что пароль надежный (хотя бы 1 большая буква, 1 маленькая, длина больше 8 и содержит один
из символов !@#$%^&*()_+)
- создайте метод signIn(login, password) - который производит логин пользователя, если он существует и если пароль
пользователя совпадает(может быть коллизия но не берите в счет этого на данном этапе)
 */
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        UserService userService = new UserService();

        userService.signUp("Test", "Test01234567");
        userService.signUp("Test", "0123");

        userService.signIn("Test", "Test01234567");
        userService.signIn("Test", "01234567Test");

//        System.out.println(isStrongPassword(string));

    }

}


