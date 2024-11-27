package book_ImproveJava._8_Inheritance.ex3_OverridingMethods;

public class Professor extends Person {
    private double salary;

    public Professor(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    public void printData() {
        System.out.println("\n.......Professor......");
        super.printData();
        System.out.printf("Salary: %.2f", salary);
    }
}
