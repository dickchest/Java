package JavaProfessionalCourseHomeWork.JavaConcsultation.Pattern.Facade;

public class LivingRoom {
    Facade livingRoom = new Facade();

    public void pressButton(String channel, String temperature) {
        livingRoom.pressButton(channel, temperature);
    }
}
