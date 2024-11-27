package book_ImproveJava._6_PackagesAndAccessModifiers.quiz4.application;

import book_ImproveJava._6_PackagesAndAccessModifiers.quiz4.device.Computer;

public class Laptop extends Computer {
    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        Computer computer = new Computer(); // fine - Computer is declared public
        Laptop laptop = new Laptop();       // fine - can create Laptop object within class Laptop
//        System.out.println(computer.brand); // false - computer brand is declared protected, making it accessable for
//                                            // subclasses outside the package, but not for the Computer class.
//        System.out.println(computer.price); // false - price is declared default and is not accessible outside the package
        System.out.println(brand);          // fine - Laptop is a subclass of the Computer class, and it can
//                                            // access the protected attributes
        System.out.println(laptop.brand);   // fine - Laptop can access protected attributes of its superclass
//        System.out.println(laptop.price);   // false - attribute price is default
    }
}
