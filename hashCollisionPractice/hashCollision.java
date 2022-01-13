package collection.hashCollisionPractice;
import java.util.*;
public class hashCollision {
    public static void main(String[] args) {
        myKey k1=new myKey(1,"First Key");
        myKey k2=new myKey(2,"Second Key");
        myKey k3=new myKey(1,"Third Key");
        myKey k4=new myKey(1,"Fourth key");
//        myKey k5=new myKey(2,"Fifth key");
//        myKey k6=new myKey(3,"Sixth key");
        HashMap<myKey,String> map=new HashMap<>();
//        System.out.println("k1 hascode : "+k1.hashCode());
        map.put(k1,"First value");
//        System.out.println("k2 hascode : "+k2.hashCode());
        System.out.println("k1 added");
        map.put(k2,"Second value");
//        System.out.println("k3 hascode : "+k3.hashCode());
        System.out.println("k2 added");
        map.put(k3,"Third value");
//        System.out.println("k4 hascode : "+k4.hashCode());
        System.out.println("k3 added");
        map.put(k4,"Fourth value");
        System.out.println("k4 added");
//        map.put(k5,"Fifth value");
//        map.put(k6,"Sixth value");
        Set<Map.Entry<myKey,String>> s=map.entrySet();
        for(Map.Entry entry:s){
            System.out.println(entry);
        }
//        Set entry=map.entrySet();
//        Iterator i=entry.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        System.out.println(map);
//        System.out.println("Getting value in Fourth key(k4)");
//        System.out.println(map.get(k4));
    }
}
