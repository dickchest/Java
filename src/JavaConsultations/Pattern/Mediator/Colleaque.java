package JavaConsultations.Pattern.Mediator;

public abstract class Colleaque {
    Chat chat;
    String name;

    public Colleaque(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void printMessage(String message);
}


class ColleagueImpl extends Colleaque {

    public ColleagueImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void printMessage(String message) {
        System.out.println(name + " get message : "+ message);
    }
}