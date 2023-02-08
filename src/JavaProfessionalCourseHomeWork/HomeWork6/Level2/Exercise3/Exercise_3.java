package JavaProfessionalCourseHomeWork.HomeWork6.Level2.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_3 {
    /*
    3. Составьте программу, облегчающую работу секретаря. Создайте объект Person с двумя параметрами имя,
    фамилия и номер телефона. Создайте List и заполните его объектами Person. Напишите программу,
    которая будет искать номера телефонов по введенной фамилии.
    Например в листе <Пупкин Вася 987654 >,<Пупкин Петя 987987>,
    <Пенков Вася 123456> при поиске по Пупкин результатом будет List : <987654>,<987987>

         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> phoneBook = new ArrayList<>();
        phoneBook.add(new Person("Пупкин Вася", 987654));
        phoneBook.add(new Person("Пупкин Петя", 987987));
        phoneBook.add(new Person("Пенков Вася", 123456));

        System.out.println("Введите фамилия для поиска телефона:");
        String surname = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < phoneBook.size(); i++) {
            String[] name = phoneBook.get(i).getName().split(" ");

            if (name[0].equals(surname)) {
                list.add(phoneBook.get(i).getPhoneNumber());
            }
        }
        System.out.println(list);

        // нужно писать так
        int max = Integer.MIN_VALUE;
    }
}

