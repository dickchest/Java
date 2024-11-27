package book_ImproveJava._9_Polymorphism.ex1_OverridingMethods;

public class Computer {
    String brand;
    double price;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void getSpecification(){
        System.out.println("brand: " + brand);
        System.out.println("price: " + price);
    }
}
