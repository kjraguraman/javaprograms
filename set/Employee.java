package collection.set;

public class Employee implements Comparable<Employee> {
    String name;
    Employee(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
    public int compareTo(Employee o){
        return this.name.compareTo(o.name);
    }
}
