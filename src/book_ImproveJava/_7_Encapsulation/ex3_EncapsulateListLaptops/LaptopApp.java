package book_ImproveJava._7_Encapsulation.ex3_EncapsulateListLaptops;

public class LaptopApp {
    public static void main(String[] args) {
        var laptop = new Laptop();
        // adds the brand Acer to the list
        laptop.getListLaptops().add("Acer");

        // removes the brand
        laptop.getListLaptops().remove(2);

        System.out.println("\n" + laptop.getListLaptops());
    }
}
