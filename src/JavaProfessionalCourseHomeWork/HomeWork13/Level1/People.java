package JavaProfessionalCourseHomeWork.HomeWork13.Level1;

public class People {
    private String firstName;
    private String lastName;

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}
