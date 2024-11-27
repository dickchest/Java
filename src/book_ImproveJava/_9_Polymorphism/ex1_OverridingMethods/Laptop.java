package book_ImproveJava._9_Polymorphism.ex1_OverridingMethods;

public class Laptop extends Computer{
    int screenSize;

    public Laptop(String brand, double price, int screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public void getSpecification() {
        System.out.println("\n----Laptop----");
        super.getSpecification();
        System.out.println("Screen size: "+ screenSize + " inches");
    }
}
