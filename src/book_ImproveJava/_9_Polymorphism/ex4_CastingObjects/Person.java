package book_ImproveJava._9_Polymorphism.ex4_CastingObjects;

public class Person {
    String name;
    String access = "Guest access";

    public Person(String name, String access) {
        this.name = name;
        this.access = access;
    }

    public void getAccess() {
        System.out.println(name + ", person: " + access);
    }
}
