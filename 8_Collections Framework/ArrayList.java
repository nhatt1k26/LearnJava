// import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        <String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
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

        // Removing an element
        fruits.remove("Orange");

        // Checking the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size()); // Output: 2
    }
}