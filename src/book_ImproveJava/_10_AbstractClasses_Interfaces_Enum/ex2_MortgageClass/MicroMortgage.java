package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex2_MortgageClass;

public class MicroMortgage {
    private double annualIncome;

    public MicroMortgage(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double calculateMort() {
        double mortgage = 4 * annualIncome;
        return mortgage;
    }
}
