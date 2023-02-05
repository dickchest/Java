package JavaCourse.Lesson5.HomeWork;

import java.util.Scanner;

public class HomeWorkLessonSixExtraPart {
    public static void main(String[] args) {
        /*
        *введите 2 слова, используйте сканер, состоящий из четного количества букв (проверьте количество букв в слове).
Получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
         */
        Scanner scanner = new Scanner(System.in);

        // ввод данных
        System.out.println("Введите первое слово:");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово:");
        String word2 = scanner.nextLine();

        // проверка на четностность количества букв
        if ((word1.length()%2 != 0) || ((word2.length()%2 != 0) )) {
            System.out.println("Слова должны быть с четным количеством букв. Результаты операции могут быть неверными");
        }

        // вывод результатов
        int length1 = word1.length()/2;
        int length2 = word2.length()/2;
        String part1 = word1.substring(0, length1);
        String part2 = word2.substring(length2, word2.length());
        System.out.println(part1 + part2);
    }
}
