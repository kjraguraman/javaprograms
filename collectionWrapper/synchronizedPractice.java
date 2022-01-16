package collection.collectionWrapper;

import java.util.*;
public class synchronizedPractice {
    public static void main(String[] args) throws InterruptedException {
        Set set=Collections.synchronizedSet(new LinkedHashSet<>());
        Thread thread1=new Thread(){
            public void run(){
                for(int i=6;i<=10;i++){
                    System.out.println("Adding "+i+" from thread1");
                    set.add(i);
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {}
                }
            }
        };
        Thread thread2=new Thread(){
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("Adding "+i+" from thread2");
                    set.add(i);
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {}
                }
            }
        };
        thread1.start();
        thread2.start();
        thread2.join();
        synchronized (set){
            Iterator iterator=set.iterator();
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println(set);
    }
}
