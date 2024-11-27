package book_ImproveJava._9_Polymorphism.quiz1b_OverridingCasting;

public class Student extends Person {
    String name = "Emma";

    @Override
    public String getName() {
        return "Olivia";
    }

    public static void main(String[] args) {
        Person person = new Student();
        Student student = (Student) person;
        System.out.println(student.name + " " + person.getName());
    }
}
