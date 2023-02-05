package JavaCourse.Lesson9;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        /*
        напишите код, кот принимает с клавиатуры числа
        пока не будет введено чило 0.
        для каждого положительного числа мы выводим положительное и наоборот
         */
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Введите число, отличное от 0:");

            inputNumber = scanner.nextInt();

            if (inputNumber < 0) {
                System.out.println("отрицательное");
            } else if (inputNumber > 0)
                System.out.println("положительный");
        } while (inputNumber != 0);

        /*
          напишите класс, который принимает с клавиатуры строку формата АВС и выводит
          колов симоволов в данной строке
         */

        print("Введите строку состояющую из символов АВС");
        String s= scanner.nextLine();
        int sum = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'B') {
                sum += 1;
            }
        }

        System.out.println(sum);

        int innerLoop = 0;
        int outerLoop = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                innerLoop +=1;
                break;
            }
            outerLoop += 1;
        }
        System.out.printf("innerLoop = %d, outerLoop = d", innerLoop, outerLoop);
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
