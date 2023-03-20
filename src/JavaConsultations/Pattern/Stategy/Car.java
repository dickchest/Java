package JavaConsultations.Pattern.Stategy;

public abstract class Car {
    Flyable flyable;

    public Car(Flyable flyable) {
        this.flyable = flyable;
    }

    public void fly() {
        flyable.fly();
    }
}
