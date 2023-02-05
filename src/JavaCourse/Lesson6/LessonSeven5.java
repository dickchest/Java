package JavaCourse.Lesson6;

public class LessonSeven5 {
    public static void main(String[] args) {

        Flask flask1 = new Flask(167);
        Flask flask2 = new Flask(30);

        Device device = new Device(flask1, flask2);
        device.isDeviceWorkingCorrectly();
    }
}
