package book_designPatterns._6_Command._5_lambda;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Создание всех устройств
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        // Готовые команды связываются с ячейками пульта
        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off, "living room light");
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off, "kitchen light");
        remoteControl.setCommand(2, ceilingFan::on, ceilingFan::off, "ceiling fan");

        Command stereoOnWithCD = () -> {
            stereo.on(); stereo.setCD(); stereo.setVolume(11);
        };
        remoteControl.setCommand(3, stereoOnWithCD, stereo::off, "stereo");
        remoteControl.setCommand(4, garageDoor::up, garageDoor::down, "garage door");

        // Метод toString выводит список ячеек и связанных с ними команд
        System.out.println(remoteControl);

        // Пульт готов к проверке!
        // Пребираем все ячейки и для каждой ячейки имитируем нажатие кнопок вкл выкл
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
