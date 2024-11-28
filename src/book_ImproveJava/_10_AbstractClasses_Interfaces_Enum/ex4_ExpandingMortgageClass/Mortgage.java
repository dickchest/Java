package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex4_ExpandingMortgageClass;

public abstract class Mortgage {
    protected String bankName;

    public Mortgage(String bankName) {
        this.bankName = bankName;
    }

    public abstract double getMortgage();
}
