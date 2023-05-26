package FCollection;

import java.util.PriorityQueue;
import java.util.Queue;
class MyClass implements Comparable<MyClass> {
    public int x;
    public int y;
    public MyClass(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(MyClass other) {
        return Integer.compare(this.x, other.x);
    }
    @Override
    public String toString(){
        return "MyClass: x:"+ x + ",y:"+y;
    }
}
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Integer Example
        Queue<Integer> myQueue1 = new PriorityQueue<>();
        myQueue1.offer(1);
        myQueue1.offer(5);
        myQueue1.offer(3);
        myQueue1.offer(4);
        myQueue1.offer(2);
        //Class Example
        Queue<MyClass> myQueue2 = new PriorityQueue<>();
        myQueue2.offer(new MyClass(1,2));
        myQueue2.offer(new MyClass(5,2));
        myQueue2.offer(new MyClass(3,2));
        myQueue2.offer(new MyClass(4,2));
        myQueue2.offer(new MyClass(2,2));
        while (myQueue2.peek() != null)
            System.out.println(myQueue2.poll()); ///????
    }
}
