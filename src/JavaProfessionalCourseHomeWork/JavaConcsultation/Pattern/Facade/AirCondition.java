package JavaProfessionalCourseHomeWork.JavaConcsultation.Pattern.Facade;

public class AirCondition {
    void turnAirCondition(String temperature) {
        System.out.println("Air Condition is turn on");
    }
}

class Light {
    void turnLight() {
        System.out.println("light is on");
    }
}

class TV{
    void playChannel(String channel) {
        System.out.println("Change channel");
    }
}
