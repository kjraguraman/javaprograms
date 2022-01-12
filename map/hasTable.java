package collection.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class hasTable {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(1,2);
        ht.put(2,3);
        Enumeration e=ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        Enumeration e1=ht.keys();
        while (e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }
        Set s=ht.entrySet();
        System.out.println(s);
        Iterator i=s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
