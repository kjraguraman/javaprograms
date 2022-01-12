package collection.map;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> names=new HashMap();
        names.put("Ragu",1);
        names.put(null,1);
        names.put(null,2);
        names.put("Ram",2);
        System.out.println(names);
//        Set s=names.entrySet();
//        Iterator i=s.iterator();
//        while(i.hasNext()){
//            Map.Entry entry=(Map.Entry)i.next();
//            if(entry.getKey().equals(3))
//                entry.setValue("Rajaguru");
//        }
//        System.out.println(names);
    }
}
