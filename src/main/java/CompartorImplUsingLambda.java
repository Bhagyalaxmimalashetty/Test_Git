import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompartorImplUsingLambda {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Bhagyalaxmi", "bhagyamalashetty@gmail.com", 100000.00));
        empList.add(new Employee("Bhagya", "bhagyamalashetty1@gmail.com", 90000.00));
        empList.add(new Employee("BhagyaAmmmu", "bhagyamalashetty1@gmail.com", 1000000.00));
        System.out.println("list of employees before sorting");
        empList.forEach(System.out::println);
        System.out.println("list of employees after sorting");
        Collections.sort(empList, new EmployeeNameSorter());
        empList.forEach(System.out::println);

        //using lambda expression
        System.out.println("using lambda expression");
        Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
    }
}


