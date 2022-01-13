package collection.hashCollisionPractice;

public class myKey {
    String name;
    int key;
    myKey(int key,String name){
        this.key=key;
        this.name=name;
    }
    public int hashCode(){ //forcing collision
        System.out.println("calling hashCode() for key : "+this.key+","+this.name);
        return key;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Object o){
        System.out.println("Checking equals() for "+this+" and "+o);
        //System.out.println("Calling equals() for -> "+o);
//        if(this.hashCode()==o.hashCode()){
//            return true;
//        }
        return false;
    }

}
