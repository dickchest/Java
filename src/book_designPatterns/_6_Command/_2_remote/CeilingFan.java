package book_designPatterns._6_Command._2_remote;

public class CeilingFan {
    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + ": Ceiling Fan is on.");
    }

    public void off() {
        System.out.println(location + ": Ceiling Fan is off.");
    }
}
