package collection.excersise.map;
import java.util.*;

public class findDuplicateLetters {
    public static void main(String[] args) {
        String s="raguraman";
        char[] array=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:array){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println("Duplicates are : ");
        Set<Character> set=map.keySet();
        for(Character c:set){
            if(map.get(c)>1)
                System.out.print(c+",");
        }
//        Iterator i=set.iterator();
//        System.out.print("Duplicate letters are : ");
//        while (i.hasNext()){
//            char c=(char)i.next();
//            if(map.get(c)>1){
//                System.out.print(c+",");
//            }
//        }
        System.out.println("\b");
    }
}

