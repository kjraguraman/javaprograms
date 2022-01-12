package collection.excersise.map;

import java.util.HashMap;
import java.util.Set;

public class findDuplicateWords {
    public static void main(String[] args) {
        String s="hi hello hi Hello welcome";
        String[] array=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:array){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }
        Set<String> set=map.keySet();
        System.out.print("Duplicate words are : ");
        for(String string:set){
            if(map.get(string)>1)
                System.out.print(string+",");
        }
        System.out.println("\b");
    }
}
