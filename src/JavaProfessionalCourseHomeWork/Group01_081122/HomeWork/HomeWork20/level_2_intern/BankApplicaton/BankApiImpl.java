package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.BankApplicaton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi{
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
        if(!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        int index = clients.indexOf(uid);
        if (index != -1) {
            return Optional.of(clients.get(index));
        }
        return Optional.empty();
    }
}
