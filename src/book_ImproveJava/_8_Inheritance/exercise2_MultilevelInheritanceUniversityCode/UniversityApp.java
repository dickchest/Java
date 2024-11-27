package book_ImproveJava._8_Inheritance.exercise2_MultilevelInheritanceUniversityCode;

import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {
        List<String> courses = List.of("Java", "Python", "C++");
        Student student = new Student("Emma", "emma@email.com",22, "A3");
        Professor professor = new Professor("Tim", "tim@email.com", 50,5600, courses);
        Manager manager = new Manager("Emma", "emma@email.com", 52, 5200, "Team ICT");
        student.printData();
        professor.printData();
        manager.printData();
    }
}
