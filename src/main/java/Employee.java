import java.util.Comparator;

public class Employee {
    private  String name;
    private  String emial;
    private  Double salary;


    public Employee(String name, String emial, Double salary) {
        this.name = name;
        this.emial = emial;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmial() {
        return emial;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", emial='" + emial + '\'' +
                ", salary=" + salary +
                '}';
    }

}
