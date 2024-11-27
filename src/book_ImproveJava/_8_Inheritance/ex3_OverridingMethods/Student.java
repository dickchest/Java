package book_ImproveJava._8_Inheritance.ex3_OverridingMethods;

public class Student extends Person {
    private String group;

    public Student(String name, String email, String group) {
        super(name, email);
        this.group = group;
    }

    public void printData() {
        System.out.println("\n.......Student......");
        super.printData();
        System.out.println("group = " + group);
    }
}
