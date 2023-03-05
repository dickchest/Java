package JavaConsultations.Pattern.Mediator;

public class Main {
    public static void main(String[] args) {
        Chat chat = new ChatMediator();
        ColleagueImpl mike = new ColleagueImpl(chat, "Mike");
        chat.addColleague(mike);

        chat.addColleague(new ColleagueImpl(chat, "Den"));
        chat.addColleague(new ColleagueImpl(chat, "Rob"));

        mike.sendMessage("Hello World!!");
    }
}
