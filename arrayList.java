package collection;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList numbers=new ArrayList();
        numbers.add(1);
        numbers.add("hi");
        numbers.add('a');
        numbers.add(1,2.0);
        numbers.remove(0);
        System.out.println(numbers);
        Iterator<Integer> i= numbers.iterator();
        while(i.hasNext())
            System.out.println(i.next());
        HashSet set=new HashSet();
        set.addAll(numbers);
        System.out.println(set);
    }
}
