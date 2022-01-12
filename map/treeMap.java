package collection.map;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
        t.put("Ragu",572);
        t.put("Arun",null);
        t.put("venkat",null);
        t.put("Ram",567);
        System.out.println(t.firstEntry());
        System.out.println(t.lastEntry());
        System.out.println(t);

    }
}
