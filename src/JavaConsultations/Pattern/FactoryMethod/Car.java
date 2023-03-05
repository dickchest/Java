package JavaConsultations.Pattern.FactoryMethod;

public interface Car {
    void drive();
}

class BMW implements Car {

    @Override
    public void drive() {
        System.out.println("BMW");
    }
}
class Mercedes implements Car {

    @Override
    public void drive() {
        System.out.println("Mercedes");
    }
}