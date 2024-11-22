package book_ImproveJava.methods;

public class Wage {
    public double getWage(int yearsOfExperience) {
        double wage = 1500;

        if (yearsOfExperience == 2) {
            wage += 1000;
        } else if (yearsOfExperience == 3) {
            wage += 2000;
        } else if (yearsOfExperience > 3) {
            wage += 3000;
        } else {
            wage = 0;
        }

        return wage;
    }

    public static void main(String[] args) {
        Wage wage = new Wage();
        System.out.printf("\nWage is: %.2f", wage.getWage(3));
        System.out.printf("\nЗначение: %10.2f%n", wage.getWage(2)); // Ширина 10, точность 2

        String text = "Hello";
        System.out.printf("|%-10s|%n", text); // Выравнивание по левому краю, ширина 10

    }
}
