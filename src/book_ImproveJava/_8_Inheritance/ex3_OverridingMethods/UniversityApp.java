package book_ImproveJava._8_Inheritance.ex3_OverridingMethods;

public class UniversityApp {
    public static void main(String[] args) {
        Student student = new Student("Emma", "emma@email.com", "A3");
        Professor professor = new Professor("Tim", "tim@email.com", 5600);
        student.printData();
        professor.printData();
    }
}