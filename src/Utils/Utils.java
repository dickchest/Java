package Utils;

import jdk.jshell.execution.Util;

import java.util.Arrays;

public class Utils {
    public static <K> void swap(K[] array, int i, int j) {

        if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length)
            throw new IllegalArgumentException("Invalid index or null array");

        K temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//    public static String secretKey(String email) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < email.length(); i++) {
//            char c = email.charAt(i);
//            c = (char) (c + 5);
//            result.append(c);
//        }
//            return result.toString();
//    }

    public static String secretKey(String email) {
        // метод для fartenbuch скрипта, что бы поставить защиту.
        // метод добавляет к каждому символу в емейле +5, что изменяет его до неузнаваемости :-)
        return email.chars()
                .map(c -> c + 5)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(secretKey("fartenbuch2024@gmail.com"));
    }
}
