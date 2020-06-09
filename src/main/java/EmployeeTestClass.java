import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeTestClass {

    public static void main(String[] args) {
        Map<Integer, Employee> map =new HashMap<>();
        map.put(1018351, new Employee("Bhagyalaxmi","bhagyamalashetty@gmail.com",100000.00));
        map.put(1018352, new Employee("Bhagya","bhagyamalashetty1@gmail.com",90000.00));
        map.put(1018353, new Employee("BhagyaAmmmu","bhagyamalashetty1@gmail.com",1000000.00));

        Set<Map.Entry<Integer,Employee >> entrySet=map.entrySet();
        for(Map.Entry<Integer,Employee> entry:entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("--------------------------------------");
        Set<Integer> keys=map.keySet();
        for(Integer key: keys){
            System.out.println(key);
            System.out.println("Value of each key" +map.get(key));
        }
        System.out.println("---------------------------------------");
        map.forEach((k,v)-> System.out.println(k +"\t"+v));
    }

}
