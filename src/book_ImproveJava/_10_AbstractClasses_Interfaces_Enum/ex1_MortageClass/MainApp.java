package book_ImproveJava._10_AbstractClasses_Interfaces_Enum.ex1_MortageClass;

public class MainApp {
    public static void main(String[] args) {
        RosaMortgage rosaMortgage = new RosaMortgage(36000, 40000);
        double mortgage = rosaMortgage.getMortgage();

        System.out.printf("\nMortgage RosaBank: %.2f", mortgage);
    }
}
