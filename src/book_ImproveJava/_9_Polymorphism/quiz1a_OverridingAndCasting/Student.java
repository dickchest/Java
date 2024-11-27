package book_ImproveJava._9_Polymorphism.quiz1a_OverridingAndCasting;

public class Student extends Person{
    String name = "Emma";

    @Override
    public String getName() {
        return "Olivia";
    }

    public static void main(String[] args) {
        Person person = new Student();
        System.out.println(person.name + " " + person.getName());
    }
}
