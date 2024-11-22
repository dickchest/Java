package book_ImproveJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObject_Employee {
    List<String> employees;

    ArrayListObject_Employee() {
        this.employees = new ArrayList<>();
        employees.add("Emma");
    }

    ArrayListObject_Employee(List<String> employees) {
        this.employees = employees;
        this.employees.add("Jack");
    }

    public static void main(String[] args) {
        ArrayListObject_Employee emp1 = new ArrayListObject_Employee();
        emp1.employees.add("David");
        ArrayListObject_Employee emp2 = new ArrayListObject_Employee(emp1.employees);

        for (String employee : emp1.employees) {
            System.out.println(employee);
        }
    }
}
