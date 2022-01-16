package collection.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
class employeeComparator implements Comparator<Employee>{
    public int compare(Employee obj1,Employee obj2){
        if(obj2.id>obj1.id)
            return 1;
        if(obj2.id<obj1.id)
            return -1;
        return 0;
    }
}
public class treeMap {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Ragu");
        Employee emp2=new Employee(2,"Arun");
        Employee emp3=new Employee(3,"Venkat");
        TreeMap<Employee,String> employees=new TreeMap(new employeeComparator());
        employees.put(emp1,"First Employee");
        employees.put(emp2,"Second Employee");
        employees.put(emp3,"Third Employee");
        System.out.println(employees);
//        TreeMap t=new TreeMap();
//        t.put("Ragu",572);
//        t.put("Arun",null);
//        t.put("venkat",null);
//        t.put("Ram",567);
//        System.out.println(t.firstEntry());
//        System.out.println(t.lastEntry());
//        System.out.println(t);

    }
}
