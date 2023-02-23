package JavaProfessionalCourseHomeWork.HomeWork11.Level1.Exercise9;

public class Client {
    private int number;
    private boolean isVip;

    public Client(int number, boolean isVip) {
        this.number = number;
        this.isVip = isVip;
    }

    public Client(int number) {
        this.number = number;
        this.isVip = false;
    }

    public int getNumber() {
        return number;
    }

    public boolean isVip() {
        return isVip;
    }

    @Override
    public String toString() {
        return "Client " + + number + " {" +
               isVip +
                "}\n";
    }
}
