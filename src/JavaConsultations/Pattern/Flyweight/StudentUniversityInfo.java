package JavaConsultations.Pattern.Flyweight;


//@AllArgsConstructor
public class StudentUniversityInfo {
    String faculty;
    String university;
    Hostel address;

    public StudentUniversityInfo(String faculty, String university, Hostel address) {
        this.faculty = faculty;
        this.university = university;
        this.address = address;
    }
}


class Hostel {

}

class StudentPersonalInfo {
    String name;
    int age;
}