package book_ImproveJava._8_Inheritance.ex3_OverridingMethods;

public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printData() {
        System.out.println("name = " + name);
        System.out.println("email = " + email);
    }
}
