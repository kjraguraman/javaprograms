package collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add(1);
        set.add(3);
        set.add(0);
        System.out.println(set);
        Set set2=set.descendingSet();
        System.out.println(set2);
        Iterator i=set.descendingIterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}
