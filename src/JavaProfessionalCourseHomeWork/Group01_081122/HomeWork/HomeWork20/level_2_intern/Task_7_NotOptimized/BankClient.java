package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_2_intern.Task_7_NotOptimized;

public class BankClient {
    private String firstName;
    private String secondName;
    private String accountNumber;

    public BankClient() {
    }

    public BankClient(String firstName, String secondName, String accountNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

enum Role {
    CAN_SEARCH_CLIENTS;
}

