package test.test5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создайте программу, которая будет проверять введённый из консоли email на корректность.
Email должен содержать имя ящика (например, bubble123), затем символ @, далее домен второго уровня (например, gmail) и
домен первого уровня (например, com), разделённые точкой.
Постарайтесь использовать регулярное выражение для проверки.
Если адрес не прошёл проверку, то метод проверки должен выбросить исключение EmailValidationException (данный класс Вам нужно создать)
с соответствующим текстом ошибки. В основной программе необходимо перехватить такое исключение.
Пользователь может вводить некорректный email не более 3 раз, после чего программа завершает работу.

Все попытки ввода неправильного email должны быть выведены перед завершением программы в консоль.
В консоли должны отобразиться номер попытки, введённый email, а также дата и время попытки.
Используя JUnit, напишите тесты для проверки метода: должны быть проверены минимум 5 различных адресов для
положительного случая работы метода и минимум 5 адресов для отрицательного случая (выбрасывание исключения).
 */
public class EnterEmail {
    private static final int MAX_ATTEMPTS = 3;
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9\\.]{1,30}@([a-zA-Z0-9\\.]+)\\.[a-zA-Z]{2,4}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Введите емейл:");
            String enteredEmail = scanner.nextLine();

            try {
                validateEmail(enteredEmail);
                System.out.println("Email is valid");
                break;
            } catch (EmailValidationException e) {
                System.out.println("Invalid email: " + e.getMessage());
                attempts++;
            }
        }
        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Max attempts reached. Exiting");
        }
    }

    public static void validateEmail(String enteredEmail) throws EmailValidationException {
        if (!enteredEmail.matches(EMAIL_REGEX)) {
            throw new EmailValidationException("Email format is invalid");
        }
    }
}

class EmailValidationException extends Exception {
    public EmailValidationException(String message) {
        super(message);
    }
}
