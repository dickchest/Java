package book_ImproveJava._8_Inheritance.exercise2_MultilevelInheritanceUniversityCode;

public class Manager extends Employee{
    protected String team;

    public Manager(String name, String email, int age, double salary, String team) {
        super(name, email, age, salary);
        this.team = team;
    }

    public void printData() {
        System.out.println("\n.......Manager......");
        super.printData();
        System.out.println("team = " + team);
    }
}
