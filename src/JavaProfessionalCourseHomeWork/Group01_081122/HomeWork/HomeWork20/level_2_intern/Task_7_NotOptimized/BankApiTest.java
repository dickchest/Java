package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.Task_7_NotOptimized;

import java.util.ArrayList;
import java.util.List;

public class BankApiTest {
    public static void main(String[] args) {

        ClientsDB db = new ClientsDB();
        db.addClient(new BankClient("Ivan", "Ivanov", "1234"));
        db.addClient(new BankClient("Petr", "Petrov", "1235"));

        BankAPI bankAPI = new BankAPI(db);

        List<Role> customer1 = new ArrayList<>();
        customer1.add(Role.CAN_SEARCH_CLIENTS);
        List<Role> customer2 = new ArrayList<>();

        System.out.println(bankAPI.searchClients("Ivan", customer1));
        System.out.println(bankAPI.searchClients("23", customer1));
        System.out.println(bankAPI.searchClients("Ivan", customer2));

    }
}
