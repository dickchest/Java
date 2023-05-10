package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.BankApplicaton;

import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
