package book_ImproveJava._8_Inheritance.exercise1_AddCoursesToTheProfessorClass;

import java.util.List;

public class Professor extends Person {
    private double salary;
    private List<String> courses;

    public Professor(String name, String email, int age, double salary, List<String> courses) {
        super(name, email, age);
        this.salary = salary;
        this.courses = courses;
    }

    public void printData() {
        System.out.println("\n.......Professor......");
        super.printData();
        System.out.printf("Salary: %.2f\n", salary);

        System.out.println("\nCourses......");
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, courses.get(i));
        }
    }
}
