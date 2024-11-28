package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex4_ExpandingMortgageClass;

public class MainApp {
    public static void main(String[] args) {
        RosaMortgage rosaMortgage = new RosaMortgage(36000, 50000);
        MicroMortgage microMortgage = new MicroMortgage(36000);

        System.out.printf("\n%s: %.2f", rosaMortgage.bankName,rosaMortgage.getMortgage());
        System.out.printf("\n%s: %.2f", microMortgage.bankName,microMortgage.getMortgage());
    }
}
