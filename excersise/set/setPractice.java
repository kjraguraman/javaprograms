package collection.excersise.set;

import java.util.*;

public class setPractice {
    public static void main(String[] args) {
        Employee e1=new Employee("Ragu",1,15000);
        Employee e2=new Employee("Ram",1,20000);
        Employee e3=new Employee("Venkat",3,30000);
        Employee e4=e3;
        Employee e5=new Employee("Venkat",4,30000);
//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//        System.out.println(e3.hashCode());
//        System.out.println(e4.hashCode());
        HashSet<Employee> employees=new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        for(Employee e:employees){
            e.display();
        }
    }
}
