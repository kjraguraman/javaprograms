package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.add(1);
        queue.add("Ragu");
        queue.add(2.0);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
