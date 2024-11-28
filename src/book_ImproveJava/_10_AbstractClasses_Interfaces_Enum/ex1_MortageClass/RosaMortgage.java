package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex1_MortageClass;

public class RosaMortgage {
    private double annualIncome;
    private double assetValue;

    public RosaMortgage(double annualIncome, double assetValue) {
        this.annualIncome = annualIncome;
        this.assetValue = assetValue;
    }

    public double getMortgage() {
        double mortgage = 3* annualIncome;
        double assetPercentage = assetValue * 0.15;
        double result = mortgage + assetPercentage;
        return result;
    }
}
