package collection.map;

import java.util.*;

public class linkedHasMap {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(1,"Ragu");
        lhm.put(2,"Ram");
        lhm.put(3,"Venkat");
        Set s=lhm.keySet();
        Iterator i=s.iterator();
        System.out.println(s);
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collection c=lhm.values();
        System.out.println(c);
        Iterator i1=c.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        Set s1=lhm.entrySet();
        System.out.println(s1);
        Iterator i3=s1.iterator();
        while (i3.hasNext()) {
            Map.Entry entry = (Map.Entry) i3.next();
            if(entry.getKey().equals(1))
            System.out.println(i3.next());
        }
    }
}
