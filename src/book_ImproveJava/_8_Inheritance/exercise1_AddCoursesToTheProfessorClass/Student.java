package book_ImproveJava._8_Inheritance.exercise1_AddCoursesToTheProfessorClass;

public class Student extends Person {
    private String group;

    public Student(String name, String email, int age, String group) {
        super(name, email, age);
        this.group = group;
    }

    public void printData() {
        System.out.println("\n.......Student......");
        super.printData();
        System.out.println("group = " + group);
    }
}
