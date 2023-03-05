package JavaConsultations.Pattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public interface Chat {
    void sendMessage(String message, Colleaque colleaque);
    void addColleague(Colleaque colleaque);
}

class ChatMediator implements Chat {
    List<Colleaque> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Colleaque iAm) {
       list.forEach(coll -> {
           if (coll != iAm) {
               coll.printMessage(message);
           }
       });
    }

    @Override
    public void addColleague(Colleaque colleaque) {
        list.add(colleaque);
    }
}