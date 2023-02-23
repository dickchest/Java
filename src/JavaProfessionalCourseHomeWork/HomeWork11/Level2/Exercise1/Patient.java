package JavaProfessionalCourseHomeWork.HomeWork11.Level2.Exercise1;

public class Patient {
    private String Name;

    public Patient(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
