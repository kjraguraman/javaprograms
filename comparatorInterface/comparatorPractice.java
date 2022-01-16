package collection.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class employeeComparator implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e2.id.compareTo(e1.id);
    }
}
class employeeComparator2 implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
public class comparatorPractice {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Ragu");
        Employee emp2=new Employee(2,"Venkat");
        Employee emp3=new Employee(3,"Ram");
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println("Before sorting");
        System.out.println(employees);
        Collections.sort(employees,new employeeComparator());
        System.out.println("After sorting");
        System.out.println(employees);
        TreeSet<Employee> employeeTreeSet=new TreeSet<>(new employeeComparator2());
        employeeTreeSet.add(emp1);
        employeeTreeSet.add(emp2);
        employeeTreeSet.add(emp3);
        System.out.println("Sorted with Comparator 2");
        System.out.println(employeeTreeSet);
    }
}
