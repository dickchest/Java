package JavaCourse.Lesson3;

import java.util.Scanner;

public class HomeWorkFromIlias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius please:");
        double radius = scanner.nextDouble();

        double circleSquare = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площадь окружности с радиусом %f равна %.2f\n", radius, circleSquare);

        //  19.10 task 5 and 6
        System.out.println("Enter your name please:");
        String name = scanner.nextLine(); // заглушка, чтобы считать пустое значение после scanner.nextDouble();
        name = scanner.nextLine();
        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your name started with symbol %s\n", name.charAt(0));


        // 19.10 task 7
        double calInSmallPizza = Math.PI * Math.pow(24/2, 2) * 40; // посчитал площадь маленькой пиццы и умножил на количество калорий в 1 см2
        double calInBigPizza = Math.PI * Math.pow(28/2, 2) * 40; // посчитал площадь большой пиццы и умножил на количество калорий в 1 см2
        double different = calInBigPizza - calInSmallPizza; // посчитал разницу каллорий
        System.out.printf("You'll eat %.2f less callories if you'll chose small pizza\n", different);
    }
}
