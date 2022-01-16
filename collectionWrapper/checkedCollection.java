package collection.collectionWrapper;

import java.util.*;

public class checkedCollection {
    static void addElement(List list){
        list.add(1);
        System.out.println("Added : 1");
        try {
            list.add("hi");
            System.out.println("Added : \"hi\"");
        }catch (ClassCastException exception){
            System.out.println("Trying to add different data type");
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        addElement(list);
        System.out.println(list);
        List<Integer> list1=Collections.checkedList(new ArrayList(),Integer.class);
        addElement(list1);
        System.out.println(list1);
    }
}
