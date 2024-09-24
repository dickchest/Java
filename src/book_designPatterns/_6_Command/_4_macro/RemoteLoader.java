package book_designPatterns._6_Command._4_macro;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Создание всех устройств
        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        // Создание команд для включения
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        // // Создание команд для выключения
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);


        // Массивы команд включения и выключения
        Command[] partyOn = {livingRoomLightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {livingRoomLightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // Готовые команды связываются с ячейками пульта
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, partyOnMacro, partyOffMacro);

        // Метод toString выводит список ячеек и связанных с ними команд
        System.out.println(remoteControl);

        // Пульт готов к проверке!
        // Пребираем все ячейки и для каждой ячейки имитируем нажатие кнопок вкл выкл
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        System.out.println("-------------------");
        System.out.println("--- Pushing Macro on ---");
        remoteControl.onButtonWasPushed(3);
        System.out.println("--- Pushing Macro off ---");
        remoteControl.offButtonWasPushed(3);
        System.out.println("--- Pushing Undo ---");
        remoteControl.undoButtonWasPushed();
    }
}
