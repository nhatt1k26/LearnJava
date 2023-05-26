package FCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        //Another way to declare and initialize array
        ArrayList<String> fruits2 = new ArrayList<>(List.of("hasd","asjdj"));

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple1");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Iterating over the ArrayList
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana); // Output: true

        // Removing an element --> Just remove first element have value equal para
        fruits.remove("Orange");

        System.out.println("2th fruit: " + fruits.get(3)); // Output: Apple

        // Checking the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size()); // Output: 2
    }
}