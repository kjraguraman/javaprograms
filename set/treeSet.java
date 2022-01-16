package collection.set;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        Employee emp1=new Employee("Ragu");
        Employee emp2=new Employee("Arun");
        Employee emp3=new Employee("Venkat");
        TreeSet<Employee> employees=new TreeSet<>();
        employees.add(emp1);
        employees.add(emp3);
        employees.add(emp2);
        System.out.println(employees);
//        TreeSet<Integer> set=new TreeSet();
//        set.add(1);
//        set.add(3);
//        set.add(0);
//        //set.add(null);
//        System.out.println(set);
//        Set set2=set.descendingSet();
//        System.out.println(set2);
//        Iterator i=set.descendingIterator();
//        while(i.hasNext())
//            System.out.println(i.next());
    }
}
