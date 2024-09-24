package book_designPatterns._6_Command._5_lambda;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    String[] names;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        names = new String[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> {};
            offCommands[i] = () -> {};
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand, String name) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        names[slot] = name;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------- Remote Controle ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + names[i] + "-on " +
                    "...." + names[i] + "-off " + "\n");
        }
        return stringBuffer.toString();
    }
}
