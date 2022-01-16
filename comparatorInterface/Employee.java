package collection.comparatorInterface;

public class Employee {
    String name;
    Integer id;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
