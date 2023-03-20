package JavaConsultations.Pattern.Stategy;

public interface Flyable {
    void fly();
}

class FlyCar implements Flyable {

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}

class NoFlyCar implements Flyable {

    @Override
    public void fly() {
        System.out.println("No Fly!");
    }
}
