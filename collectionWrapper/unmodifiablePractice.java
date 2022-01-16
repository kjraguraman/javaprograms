package collection.collectionWrapper;
import java.util.*;
public class unmodifiablePractice {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.set(0,1);
        List list=Collections.unmodifiableList(arrayList);
        //list.add(1);//UnsupportedOperationException
        //list.set(0,1);//UnsupportedOperationException
        Iterator i=list.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        TreeMap<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(3,"three");
        treeMap.put(1,"one");
        treeMap.put(2,"two");
        Map<Integer,String> map=Collections.unmodifiableSortedMap(treeMap);
        //map.put(4,"four");//UnsupportedOperationException
        Iterator<Integer> i2=map.keySet().iterator();
        while(i2.hasNext()){
            Integer key=i2.next();
            String value=map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
