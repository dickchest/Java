package book_ImproveJava._9_Polymorphism.ex4_CastingObjects;

public class Student extends Person{
    public Student(String name) {
        super(name, "Basic access");
    }

    @Override
    public void getAccess() {
        System.out.println(name + ", student: " + access);
    }
}
