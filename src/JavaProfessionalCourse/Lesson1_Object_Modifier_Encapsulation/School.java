package JavaProfessionalCourse.Lesson1_Object_Modifier_Encapsulation;

public class School {

    private int number;
    private String adress;

    public School() {
    }

    public School(int number, String adress) {
        this.number = number;
        this.adress = adress;
    }

    public School(String adress) {
        this.adress = adress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
