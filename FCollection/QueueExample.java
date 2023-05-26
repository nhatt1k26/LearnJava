package FCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<String>();

        // Queue Specific method
        // 1.Throws an exption
        myQueue.offer("offer1");
        myQueue.offer("offer2");
        myQueue.offer("offer3");
        myQueue.offer("offer4");

        myQueue.add("add1");
        myQueue.add("add2");
        myQueue.add("add3");
        myQueue.add("add4");

        System.out.println(myQueue.peek());
        myQueue.poll();
        System.out.println(myQueue.element());
        myQueue.remove();
        System.out.println(myQueue.element());


    }
}
