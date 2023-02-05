package JavaCourse.Lesson7;

public class Four {
    public static void main(String[] args) {
        int buttonPressed = 5;

        switch (buttonPressed) {// 1, 2 ,3
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("invalid data");
        }
        String dayTime;
        dayTime = null;
        switch (buttonPressed) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayTime = "Weekday";
                break;
            case 6:
            case 7:
                dayTime = "Weekend";
                break;
        }

        System.out.println(dayTime);

        String name = "John";

        switch (name) {
            case "marry":
                System.out.println("Hi Marry");
                break;
            case "John":
                System.out.println("Hi John");
                break;
            default:
                System.out.println("Hi unknown person");
        }
    }
}
