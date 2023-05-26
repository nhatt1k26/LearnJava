package FCollection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        // We can create new TreeMap with descending order
//        TreeMap<String, Integer> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
        //Or create new TreeMap with custom order
        TreeMap<String, Integer> treeMap3 = new TreeMap<>(new CustomComparator());


        // Add key-value pairs to the map
        treeMap.put("John", 25);
        treeMap.put("Emily", 30);
        treeMap.put("Mark", 20);
        treeMap.put("Jessica", 35);
        treeMap.put("David", 28);

        // Print the map
        System.out.println("Original TreeMap: " + treeMap);

        // Accessing values by key
        int age = treeMap.get("John");
        System.out.println("Age of John: " + age);

        // Updating the value for a key
        treeMap.put("John", 26);
        System.out.println("Updated TreeMap: " + treeMap);

        // Removing a key-value pair
        treeMap.remove("Mark");
        System.out.println("TreeMap after removing Mark: " + treeMap);

        // Iterating over the map
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
    static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            // Define your custom order logic here
            // This example orders the keys in reverse alphabetical order
            return o2.compareTo(o1);
        }
    }
}