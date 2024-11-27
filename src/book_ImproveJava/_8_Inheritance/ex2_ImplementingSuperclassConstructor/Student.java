package book_ImproveJava._8_Inheritance.ex2_ImplementingSuperclassConstructor;

public class Student extends Person {
    private String group;

    public Student(String name, String email, String group) {
        super(name, email);
        this.group = group;
    }

    public void printData() {
        System.out.println("\n.......Student......");
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.println("group = " + group);
    }
}
