package book_ImproveJava._8_Inheritance.exercise2_MultilevelInheritanceUniversityCode;

import java.util.List;

public class Professor extends Employee {
    private List<String> courses;

    public Professor(String name, String email, int age, double salary, List<String> courses) {
        super(name, email, age, salary);
        this.courses = courses;
    }

    public void printData() {
        System.out.println("\n.......Professor......");
        super.printData();
        System.out.println("\nCourses......");
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, courses.get(i));
        }
    }
}
