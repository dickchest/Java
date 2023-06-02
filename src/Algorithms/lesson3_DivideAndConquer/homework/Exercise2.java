package Algorithms.lesson3_DivideAndConquer.homework;
/*
Решите задачу: Расставьте в алфавитном порядке буквы. Разрешается
использование техники Разделяй и властвуй. Полученные данные напечатайте.
👉👉👉 На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)
 */
public class Exercise2 {
    public static String sortAlphabetically(String input) {
        if (input.length() <= 1) {
            return input.toUpperCase();
        }

        int mid = input.length() / 2;
        String left = sortAlphabetically(input.substring(0, mid));
        String right = sortAlphabetically(input.substring(mid));

        System.out.println(left + " " + right);
        String mstr = mergeStrings(left, right);
        System.out.println("Merged: " + mstr);
        return mstr;
    }

    public static String mergeStrings(String str1, String str2) {
        StringBuilder merged = new StringBuilder();
        int i = 0; // индекс для str1
        int j = 0; // индекс для str2

        // Объединение строк в алфавитном порядке
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) < str2.charAt(j)) {
                merged.append(str1.charAt(i));
                i++;
            } else {
                merged.append(str2.charAt(j));
                j++;
            }
        }

        // Добавление оставшихся символов из str1 (если они есть)
        while (i < str1.length()) {
            merged.append(str1.charAt(i));
            i++;
        }

        // Добавление оставшихся символов из str2 (если они есть)
        while (j < str2.length()) {
            merged.append(str2.charAt(j));
            j++;
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";
        String result = sortAlphabetically(input);
        System.out.println(result);
    }
}