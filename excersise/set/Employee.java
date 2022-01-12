package collection.excersise.set;

public class Employee {
    String name;
    int empId,salary;
    Employee(String n,int eid,int s){
        name=n;
        empId=eid;
        salary=s;
    }
    public boolean equals(Object o){
        Employee e=(Employee) o;
        if(this.empId==e.empId){
            return true;
        }
//        int result=this.name.compareTo(e.name);
//        if(result>0)
//            return  true;
        return false;
    }
    void display(){
        System.out.println(name+" "+empId+" "+salary);
    }
//    public String toString(){
//        return name+" "+empId+" "+salary;
//    }
    public int hashCode(){
        return 1;
    }
}
