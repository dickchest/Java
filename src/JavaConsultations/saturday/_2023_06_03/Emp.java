package JavaConsultations.saturday._2023_06_03;

public class Emp {
    public int id;
    public String name;
    public String department;

    private double salary = 2222;

    public Emp() {
    }

    private void changeDep(String newDep) {
        department = newDep;
        System.out.println("New department is: " + department);
    }

    public void increaseSalary() {
        salary *= 1.5;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Emp(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
