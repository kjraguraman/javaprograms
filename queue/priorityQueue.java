package collection.queue;

import java.util.Enumeration;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue queue=new PriorityQueue();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(2);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue);
    }
}
