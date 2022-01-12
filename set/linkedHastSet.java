package collection.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedHastSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet();
        set.add(4);
        set.add(2);
        set.add(2);
        set.add(3);
        set.remove(2);
        System.out.println(set);
        TreeSet treeSet=new TreeSet();
        treeSet.addAll(set);
        System.out.println(treeSet);
    }
}
