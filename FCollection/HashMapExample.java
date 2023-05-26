package FCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Alice", 90);
        newMap.put("Bob", 85);
        newMap.put("Charlie", 95);
        newMap.put("Alain", 95);
        newMap.put("Lili", 95);
        newMap.put("Hash", 95);
        newMap.put("Tel", 95);

        //Warning
//        newMap.put("Alice", 90);
        // Accessing values using keys
        int score1 = newMap.get("Alice");
        System.out.println("Alice's score: " + score1); // Output: Alice's score: 90

        // Updating values
        newMap.put("Alice", 92);
        int score2 = newMap.get("Alice");
        System.out.println("Alice's updated score: " + score2); // Output: Alice's updated score: 92

        // Iterating over the HashMap
        System.out.println("Student scores:");
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            System.out.println(student + ": " + score);
        }

        // Checking if a key exists
        boolean containsBob = newMap.containsKey("Nhat");
        System.out.println("Contains Nhat? " + containsBob); // Output: Contains Bob? true

        // Removing a key-value pair
        newMap.remove("Charlie");

        // Checking the size of the HashMap
        System.out.println("Number of students: " + newMap.size()); // Output: Number of students: 2
    }
}
