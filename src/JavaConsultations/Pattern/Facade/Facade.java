package JavaConsultations.Pattern.Facade;

public class Facade {

    TV tv;

    AirCondition airCondition;

    Light lIght;

    public void pressButton(String channel, String temperature) {
        tv.playChannel(channel);
        airCondition.turnAirCondition(temperature);
        lIght.turnLight();

    }

}
