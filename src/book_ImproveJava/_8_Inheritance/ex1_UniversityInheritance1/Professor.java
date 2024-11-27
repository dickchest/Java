package book_ImproveJava._8_Inheritance.ex1_UniversityInheritance1;

public class Professor {
    private String name;
    private String email;
    private double salary;

    public Professor(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void printData() {
        System.out.println("\n.......Professor......");
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.printf("Salary: %.2f", salary);
    }
}
