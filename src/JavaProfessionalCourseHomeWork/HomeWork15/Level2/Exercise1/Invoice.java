package JavaProfessionalCourseHomeWork.HomeWork15.Level2.Exercise1;

public class Invoice {
    private final Person person;
    private final Bill bill;
    public Invoice(Person person, Bill bill) throws CloneNotSupportedException {
        this.person = person.clone();
        this.bill = bill;
    }
}
