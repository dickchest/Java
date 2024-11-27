package book_ImproveJava._9_Polymorphism.ex4_CastingObjects;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Student student = new Student("Boris");
        Professor professor = new Professor("David");

        persons.add(student);
        persons.add(professor);

        for (Person person : persons) {
            person.getAccess();
        }

    }
}
