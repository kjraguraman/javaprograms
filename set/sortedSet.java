package collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
class descendingSort implements Comparator<Integer>{
    public int compare(Integer s1,Integer s2){
        return s1.compareTo(s2);
    }
    public String toString() {
        return "descendingSort";
    }
}
public class sortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> set=new TreeSet<>((s1,s2)->s2.compareTo(s1));
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.comparator());
        System.out.println(set);
        //System.out.println(set.headSet("i"));
        //SortedSet<String> set1=set.subSet("h","i");
        //System.out.println(set1);
    }
}
