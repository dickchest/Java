package book_ImproveJava._8_Inheritance.ex2_ImplementingSuperclassConstructor;

public class Professor extends Person{
    private double salary;

    public Professor(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    public void printData() {
        System.out.println("\n.......Professor......");
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.printf("Salary: %.2f", salary);
    }
}
