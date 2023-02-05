package JavaCourse.Lesson4;

public class Phone {
    private final String brand;
    private final int storage;
    private int powerCapacity;
    private double displaySize;
    private final String connector;

    public Phone (String brand, int storage, int powerCapacity, double displaySize, String connector) {
        this.brand = brand;
        this.storage = storage;
        this.powerCapacity = powerCapacity;
        this.displaySize = displaySize;
        this.connector = connector;
    }
}
