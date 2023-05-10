package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.BankApplicaton;

import java.util.Optional;

public interface BankApi{
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
