import java.util.ArrayList;

public class Employee implements Comparable {

    private int salary;
    private String name;
    private String department;
    private String title;
    private int tier;

    public Employee (int salary, String name, String department, String title) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.title = title;
        this.tier = 1;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
