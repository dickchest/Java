package JavaCourse.Lesson3;

import java.util.Scanner;

public class HomeWorkThird {
    public static void screen(String string) {
        System.out.println(string);
    }
    public static void main(String[] args) {

//        First level: Часть 1.
//        1 Создайте строку через new - I study Basic Java!
        String temp = new String("I study Basic Java!");

//        2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        screen(temp);
//        3 Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(temp.charAt(temp.length()-1));

//        4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(temp.contains("Java"));

//        5 Заменить все символы “а” на “о”.  (при помощи метода replace() класса String)
        System.out.println(temp.replace("a", "o"));

//        6 Преобразуйте строку к верхнему регистру.
        System.out.println(temp.toUpperCase());

//        7 Преобразуйте строку к нижнему регистру.
        System.out.println(temp.toLowerCase());

//        8 Вырезать строку Java c помощью метода String.substring().
        System.out.println(temp.substring(temp.indexOf("Java"), temp.lastIndexOf("!")));
        System.out.println(temp.substring(14, 18));
//
//                Часть 2. (дополнительно)
//
//                Напишите программу, которая получает два целых числа от пользователя и отображает (для 500 и 125):
//        число 1 = 500 число 2 = 125
//        500 + 125 = 625
//        500 - 125 = 375
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int numberA = scanner.nextInt();
        System.out.println("Введите второе число:");
        int numberB = scanner.nextInt();
        System.out.printf("%s + %s = %s%n", numberA, numberB, numberA + numberB);
        System.out.printf("%s - %s = %s%n", numberA, numberB, numberA - numberB);

//        Напишите программу, которая получает от пользователя два целых числа (стороны прямоугольника, а затем отображает: “Площадь прямоугольника со стороной 1 = …. и стороной 2 =…… равна …….” и результат, вычисленный по формуле сторона 1*сторона 2
        System.out.println("Введите первое число:");
        numberA = scanner.nextInt();
        System.out.println("Введите второе число:");
        numberB = scanner.nextInt();
        System.out.println("Площадь прямоугольника со стороной 1 = " + numberA + " и стороной 2 = " + numberB + " равна " + (numberA * numberB) + ".");
//
//        Напишите программу, которая получает два целых числа от пользователя и отображает (для 12 и 3):
//        12 + 3 = 15
//        12 - 3 = 9
        System.out.println("Введите первое число:");
        numberA = scanner.nextInt();
        System.out.println("Введите второе число:");
        numberB = scanner.nextInt();
        System.out.println(numberA + " + " + numberB + " = " + (numberA + numberB));
        System.out.println(numberA + " - " + numberB + " = " + (numberA - numberB));
//
//        Напишите программу, которая получает радиус от пользователя, а затем отображает: “Площадь окружности с радиусом …..” и результат, вычисленный по формуле 3.14 *r *r
        System.out.println("Введите радиус окружности:");
        int radius = scanner.nextInt();
        System.out.println("Площадь окружности с радиусом " + radius + " равна " + (3.14 * radius * radius));
//
//        Напишите программу, которая запрашивает имя пользователя и отображает “Привет имя!” на экране.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = scanner1.nextLine();
        System.out.println("Привет " + name + "!");

//        Напишите программу, которая запрашивает имя пользователя и выводит на экран надпись “Ваше имя начинается с символа …..”.
//        используйте метод charAt() класса String
        System.out.println("Ваше имя начинается с символа " + name.charAt(0) + ".");
//
//        7.* Напишите программу, которая подсчитает, сколько дополнительных калорий будет, если вы купите пиццу диаметром 28 см вместо пиццы диаметром 24 см. Чтобы решить эту проблему, давайте предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
        double sPizza1 = Math.PI * 28 * 28, sPizza2 = Math.PI * 24 * 24;
        System.out.println("Количество дополнительных каллорий приблизительнов = " + Math.round((sPizza1 - sPizza2) * 40));
//
//                дополнительную информацию по классу String  и его методам вы можете посмотреть здесь https://docs.oracle.com/javase/7/docs/api/java/lang/String.html или в любом другом удобном для вас источнике
    }
}
