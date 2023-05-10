package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.Task_7_NotOptimized;

import java.util.ArrayList;
import java.util.List;

public class BankAPI {
    private List<Role> authorizedRoles;
    private List<BankClient> clients;

    public BankAPI(ClientsDB clientsDB) {
        authorizedRoles = new ArrayList<>();
        authorizedRoles.add(Role.CAN_SEARCH_CLIENTS);
        // загрузка базы клиентов
        clients = clientsDB.getFullDB();
    }

    public List<BankClient> searchClients(String query, List<Role> roles) {
        if (!isAuthorized(roles, Role.CAN_SEARCH_CLIENTS)) {
            throw new SecurityException("You are not authorized to search clients");
        }
        List<BankClient> result = new ArrayList<>();
        for (BankClient client : clients) {
            if (client.getFirstName().contains(query) || client.getSecondName().contains(query) || client.getAccountNumber().contains(query)) {
                result.add(client);
            }
        }
        return result;
    }

    private boolean isAuthorized(List<Role> userRoles, Role requiredRole) {
        return userRoles.contains(requiredRole) && authorizedRoles.contains(requiredRole);
    }
}
