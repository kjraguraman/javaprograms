package collection.comparableInterface;

public class Employee implements Comparable<Employee> {
    String name;
    int id;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return name;
    }
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
