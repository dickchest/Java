package book_ImproveJava._8_Inheritance.exercise1_AddCoursesToTheProfessorClass;

public class Person {
    protected String name;
    protected String email;
    protected int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void printData() {
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.println("age = " + age);
    }
}
