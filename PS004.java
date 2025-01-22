class EmployeeDetails {
    private String name;
    private int id;
    private double salary;
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void showDetails() {
        System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary);
    }
}
class FullTimeEmployee extends EmployeeDetails {
    private String benefits;
    public FullTimeEmployee(String name, int id, double salary, String benefits) {
        super(name, id, salary);
        this.benefits = benefits;
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Benefits: " + benefits);
    }
}
class PartTimeEmployee extends EmployeeDetails {
    private double hourlyRate;
    public PartTimeEmployee(String name, int id, double salary, double hourlyRate) {
        super(name, id, salary);
        this.hourlyRate = hourlyRate;
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}
public class PS004 {
    public static void main(String[] args) {
        new FullTimeEmployee("Mahesh", 101, 50000, "Life Insurance").showDetails();
        System.out.println();
        new PartTimeEmployee("Bob", 102, 25000, 20).showDetails();
    }
}
