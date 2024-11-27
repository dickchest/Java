package book_ImproveJava._9_Polymorphism.ex4_CastingObjects;

public class Professor extends Person{
    public Professor(String name) {
        super(name, "Admin access");
    }

    @Override
    public void getAccess() {
        System.out.println(name + ", professor: " + access);
    }
}
