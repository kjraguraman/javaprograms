package collection;
class Parent{
    String name;
    void display(){
        System.out.println("I am Parent.My name is "+name);
    }
    void setName(String name){
        this.name=name;
    }
}
class Engineer extends Parent{
    void display(){
        System.out.println("I am Child.\nMy qualification is B.E");

    }
}
public class anonymousClassPractice {
    public static void main(String[] args) {
        Parent parent=new Parent();
        Parent child=new Parent(){//Anonymous class
            void display() {
                System.out.println("I am child.\nMy qualification is 8th");
            }
//            void qualification() {//only override methods can access with child object.
//                System.out.println("My qualification is 10th");
//            }
        };
        parent.setName("XXXX");
        parent.display();
//        child.setName("Check");
        child.display();
//        Child child=new Child();
//        child.display();
        Engineer e1=new Engineer();
        e1.display();
        Engineer e2=new Engineer();
        e2.display();
    }
}
