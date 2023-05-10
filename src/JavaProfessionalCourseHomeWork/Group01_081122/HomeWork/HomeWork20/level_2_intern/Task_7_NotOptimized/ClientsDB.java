package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.Task_7_NotOptimized;

import java.util.ArrayList;
import java.util.List;

public class ClientsDB {
    List<BankClient> clients;

    public ClientsDB() {
        clients = new ArrayList<>();
    }

    public void addClient(BankClient client) {
        this.clients.add(client);
    }

    public List<BankClient> getFullDB() {
        return clients;
    }
}
