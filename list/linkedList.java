package collection.list;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(1);
        list.add("one");
        list.add(2.0);
        list.addFirst("First");
        list.addLast(3);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.indexOf(2.0));
    }
}
