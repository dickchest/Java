package book_designPatterns._6_Command._4_macro;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
