package book_ImproveJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Employee {
    List<String> employees;

    ArrayList_Employee() {
        this.employees = new ArrayList<>();
        employees.add("Emma");
    }

    ArrayList_Employee(List<String> employees) {
        this.employees = employees;
        this.employees.add("Jack");
    }

    public static void main(String[] args) {
        ArrayList_Employee emp1 = new ArrayList_Employee();
        emp1.employees.add("David");
        ArrayList_Employee emp2 = new ArrayList_Employee(emp1.employees);

        for (String employee : emp2.employees) {
            System.out.println(employee);
        }
    }
}
