package book_ImproveJava._9_Polymorphism.ex2_OverloadingMethods;

public class Employee {
    public double netWage() {
        double netWg = 3000 - (3000 * 30) / 100;
        return netWg;
    }

    public double netWage(double grossWage) {
        double netWg = (grossWage * 30) / 100;
        return netWg;
    }

    public double netWage(double grossWage, int taxRate) {
        double netWg = grossWage - (grossWage * taxRate) / 100;
        return netWg;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.printf("\nNet wage: %.2f", employee.netWage());
        System.out.printf("\nNet wage: %.2f", employee.netWage(2500.65));
        System.out.printf("\nNet wage: %.2f", employee.netWage(2000, 35));
    }
}
