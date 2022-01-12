package collection;

import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(2,4);
        v.remove(0);
        v.add(null);
        System.out.println(v.indexOf(2));
        System.out.println(v);
        Vector v1=new Vector();
        v1.addAll(v);
        v1.remove((Object)2);
        System.out.println(v1);
    }
}
