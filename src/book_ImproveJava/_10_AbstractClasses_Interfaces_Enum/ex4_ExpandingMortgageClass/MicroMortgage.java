package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex4_ExpandingMortgageClass;

public class MicroMortgage extends Mortgage {
    private final double annualIncome;

    public MicroMortgage(double annualIncome) {
        super("Micro Bank");
        this.annualIncome = annualIncome;
    }

    @Override
    public double getMortgage() {
        double mortgage = 4 * annualIncome;
        return mortgage;
    }
}
