package book_designPatterns._6_Command._2_remote;

public class Stereo {
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + ": Stereo is on");
    }

    public void setCD() {
        System.out.println(location + ": Stereo set to CD");
    }

    public void setDVD() {
        System.out.println(location + ": Stereo is set for DVD input");
    }


    public void setVolume(int i) {
        System.out.printf(location + ": Volume set to %d\n", i);
    }

    public void off() {
        System.out.println(location + ": Stereo is off");
    }
}
