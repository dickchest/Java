package JavaCourse.Lesson6;

import java.util.Scanner;

public class LessonSevenThree {
    public static void main(String[] args) {
        // у нас есть школьник у него есть имя. оно получается
        // с помощью ввода из консоли.у него есть пол. у него есть оценки за четверть
        // 4 четверти по математике. нам нужно определить и вывести в консоль
        // являлиется ли он отличником. В зависимости от пола нам необходимов написать
        // соотв. обращение в консколь
        // {name} является отличником
        // {name} яляется отличницей
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день, ученик! Как ваше имя?");
        String name = scanner.nextLine();
        System.out.printf("Cпасибо, %s! Какой у вас пол?", name);
        String genderString = scanner.next();
        char gender = genderString.charAt(0);

        System.out.println("Какая оценка за 1й семестр?");
        int semestr1Grade = scanner.nextInt();
        System.out.println("Какая оценка за 2й семестр?");
        int semestr2Grade = scanner.nextInt();
        System.out.println("Какая оценка за 3й семестр?");
        int semestr3Grade = scanner.nextInt();
        System.out.println("Какая оценка за 4й семестр?");
        int semestr4Grade = scanner.nextInt();
        Pupil pupil = new Pupil("John", 'm');

        int sum = semestr1Grade + semestr2Grade + semestr3Grade + semestr4Grade;

        boolean allFives = semestr1Grade == 5 &&
                semestr2Grade == 5 &&
                semestr3Grade == 5 &&
                semestr4Grade == 5;

        boolean isMaleOtlichnik = allFives && pupil.gender == 'm';
        boolean isMaleOtlichniza = allFives && pupil.gender == 'f';

        if (isMaleOtlichnik) {
            System.out.printf("%s является отличником!", pupil.name);
        }
        if (isMaleOtlichniza) {
            System.out.printf("%s является отличницей!", pupil.name);
        }
    }
}
