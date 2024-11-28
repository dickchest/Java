package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex3_AbstractMortgageClass;

public class RosaMortgage extends Mortgage {
    private final double annualIncome;
    private final double assetValue;

    public RosaMortgage(double annualIncome, double assetValue) {
        this.annualIncome = annualIncome;
        this.assetValue = assetValue;
    }

    public double getMortgage() {
        double mortgage = 3 * annualIncome;
        double assetPercentage = assetValue * 0.15;
        double result = mortgage + assetPercentage;
        return result;
    }
}
