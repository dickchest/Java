package book_ImproveJava._8_Inheritance.ex1_UniversityInheritance1;

public class Student {
    private String name;
    private String email;
    private String group;

    public Student(String name, String email, String group) {
        this.name = name;
        this.email = email;
        this.group = group;
    }

    public void printData() {
        System.out.println("\n.......Student......");
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.println("group = " + group);
    }
}
