package book_ImproveJava;

public class Aircraft {
    String brand;
    int nrSeats;

    Aircraft() {
        this.brand = "Airbus";
        this.nrSeats = 250;
    }

    Aircraft(String brand) {
        this();
        brand = "Hawker";
        nrSeats = 300;
    }

    public static void main(String[] args) {
        Aircraft ac = new Aircraft("Boing");
        System.out.println(ac.brand + ", " + ac.nrSeats);
    }
}
