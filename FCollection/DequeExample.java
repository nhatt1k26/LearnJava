package FCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front of the deque
        deque.offerFirst("Element 1");
        deque.offerFirst("Element 2");
        deque.offerFirst("Element 3");

        // Add elements to the end of the deque
        deque.offerLast("Element 4");
        deque.offerLast("Element 5");
        deque.offerLast("Element 6");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Access elements from the front and end of the deque
        String firstElement = deque.peekFirst();
        String lastElement = deque.peekLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the front and end of the deque
        deque.pollFirst();
        deque.pollLast();

        // Print the deque after removal
        System.out.println("Deque after removal: " + deque);
    }
}
