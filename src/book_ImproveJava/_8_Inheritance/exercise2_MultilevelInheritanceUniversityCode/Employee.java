package book_ImproveJava._8_Inheritance.exercise2_MultilevelInheritanceUniversityCode;

public class Employee extends Person{
    protected double salary;

    public Employee(String name, String email, int age, double salary) {
        super(name, email, age);
        this.salary = salary;
    }

    public void printData() {
        super.printData();
        System.out.println("salary = " + salary);
    }
}
