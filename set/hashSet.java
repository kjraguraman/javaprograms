package collection.set;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(2);
        set.add(3);
        set.add(1);
        set.add("hi");
        set.add(null);
        System.out.println(set.contains("hi"));
        System.out.println("Before clear set : "+set);
        set.clear();
        System.out.println("After clear set : "+set);
    }
}
