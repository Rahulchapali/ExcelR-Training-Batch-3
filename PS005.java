import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class CollectionMap {
    private Map<Integer, Employee> employeeMap;

    public CollectionMap() {
        this.employeeMap = new HashMap<>();
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1;
        }
        if (employeeMap.containsKey(emp.getId())) {
            return 2;
        }
        employeeMap.put(emp.getId(), emp);
        return 0;
    }

    public int removeEmployee(int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            return 2;
        }
        employeeMap.remove(employeeId);
        return 0;
    }

    public Employee findEmployee(int employeeId) {
        return employeeMap.get(employeeId);
    }

    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeMap.values());
    }
}

public class PS005 {
    public static void main(String[] args) {
        CollectionMap collectionMap = new CollectionMap();
        Employee employee1 = new Employee(1, "John Doe", 50000.0);
        Employee employee2 = new Employee(2, "Jane Doe", 60000.0);
        System.out.println("Add employee1: " + collectionMap.addEmployee(employee1));
        System.out.println("Add employee2: " + collectionMap.addEmployee(employee2));
        System.out.println("Add employee1 again: " + collectionMap.addEmployee(employee1));
        System.out.println("Find employee1: " + collectionMap.findEmployee(1));
        System.out.println("Find employee2: " + collectionMap.findEmployee(2));
        System.out.println("Get employee list: " + collectionMap.getEmployeeList());
        System.out.println("Remove employee1: " + collectionMap.removeEmployee(1));
        System.out.println("Remove employee1 again: " + collectionMap.removeEmployee(1));
        System.out.println("Get employee list after removal: " + collectionMap.getEmployeeList());
    }
}