package collection.excersise.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class charCount {
    public static void main(String[] args) {
        String s="ammaappa";
        char[] array=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap();
        for(char c:array){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        Set set=map.keySet();
        Iterator i=set.iterator();
        while(i.hasNext()){
            char c=(char)i.next();
            System.out.println(c+" occurs "+map.get(c)+" times");
        }
    }
}
