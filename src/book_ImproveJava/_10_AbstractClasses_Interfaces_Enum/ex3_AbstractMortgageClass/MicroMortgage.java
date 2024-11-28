package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex3_AbstractMortgageClass;

public class MicroMortgage extends Mortgage {
    private final double annualIncome;

    public MicroMortgage(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Override
    public double getMortgage() {
        double mortgage = 4 * annualIncome;
        return mortgage;
    }
}
