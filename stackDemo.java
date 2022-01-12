package collection;

import java.util.Enumeration;
import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack numbers=new Stack();
        numbers.push(2);
        numbers.add(3);
        numbers.add(0,1);
        System.out.println("peek :"+numbers.peek());
        numbers.pop();
        System.out.println("First element : "+numbers.firstElement());
        System.out.println(numbers);
        Enumeration e=numbers.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
