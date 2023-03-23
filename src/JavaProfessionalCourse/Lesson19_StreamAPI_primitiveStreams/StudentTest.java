package JavaProfessionalCourse.Lesson19_StreamAPI_primitiveStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentTest {
    private static record Student(int age, String name) {
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Petya"));
        students.add(new Student(19, "Rita"));
        students.add(new Student(19, "Zina"));
        students.add(new Student(20, "Nina"));
        students.add(new Student(25, "Yulia"));
        students.add(new Student(30, "Vasya"));
        students.add(new Student(30, "Sasha"));
        students.add(new Student(35, "Kolya"));
        students.add(new Student(70, "Vanya"));

        students.stream()
                .filter(stud -> stud.age > 30)
                .findFirst()
                .ifPresent(System.out::println);

        List<String> res = students.stream()
                .filter(stud -> stud.age <= 30)
                .filter(stud -> stud.age > 20)
                .map(Student::name)
                .collect(Collectors.toList());

        System.out.println(res);

    }
}
