package collection.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
public class comparablePractice {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Ragu");
        Employee e2=new Employee(2,"Arun");
        Employee e3=new Employee(3,"Bala");
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println("Before sorting");
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println("After sorting");
        System.out.println(employees);
    }
}
