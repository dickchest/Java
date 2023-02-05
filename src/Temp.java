import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int result = sideA * sideB;
        System.out.printf("Площадь %s со стороной 1 = %d и стороной 2 = %d равна %d\n", "прямогульника", sideA, sideB, result);

        System.out.println("Enter radius please:");
        double radius = scanner.nextDouble();
        double circleSquare = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площадь окружности с радиусом %f равна %.2f\n", radius,circleSquare);

    }
}
