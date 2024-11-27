package book_ImproveJava._7_Encapsulation.ex3_EncapsulateListLaptops2;

public class LaptopApp {
    public static void main(String[] args) {
        var laptop = new Laptop();
        // trying to add the brand Acer to the list
        laptop.getListLaptops().add("Acer");

        // trying to remove the brand
        laptop.getListLaptops().remove(2);
        System.out.println("The list is read only");

        System.out.println("\n" + laptop.getListLaptops());
    }
}
