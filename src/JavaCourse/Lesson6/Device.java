package JavaCourse.Lesson6;

public class Device {

    public Flask flask1;
    public Flask flask2;
    public Device(Flask flask1, Flask flask2) {
        this.flask1 = flask1;
        this.flask2 = flask2;
    }
    public void isDeviceWorkingCorrectly() {
        double t1 = flask1.temperature;
        double t2 = flask2.temperature;
        boolean isWorkingCorrectly = (t1 > 100) && (t2 < 100);
        System.out.println(isWorkingCorrectly);
    }
}
