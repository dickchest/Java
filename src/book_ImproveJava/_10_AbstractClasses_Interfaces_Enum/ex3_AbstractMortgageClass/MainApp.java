package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex3_AbstractMortgageClass;

public class MainApp {
    public static void main(String[] args) {
        RosaMortgage rosaMortgage = new RosaMortgage(36000, 50000);
        MicroMortgage microMortgage = new MicroMortgage(36000);

        System.out.printf("\nMortgage RB: %.2f", rosaMortgage.getMortgage());
        System.out.printf("\nMortgage MB: %.2f", microMortgage.getMortgage());
    }
}
