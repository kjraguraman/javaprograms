package collection.list;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(1,2);
        list.add(3);
        list.set(0,0);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));
    }
}
