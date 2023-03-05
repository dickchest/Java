package JavaConsultations.Pattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory mercedesFactory = new MercedesFactory();
        mercedesFactory.createCar();
    }
}
