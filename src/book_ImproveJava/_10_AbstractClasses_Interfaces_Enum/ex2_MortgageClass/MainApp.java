package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex2_MortgageClass;

public class MainApp {
    public static void main(String[] args) {
        MicroMortgage microMortgage = new MicroMortgage(36000);
        double microBank = microMortgage.calculateMort();

        System.out.printf("\nMortgage MicroBank: %.2f", microBank);
    }
}
