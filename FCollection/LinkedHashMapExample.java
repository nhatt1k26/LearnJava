package FCollection;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,String> myHash = new LinkedHashMap<>();
        myHash.put("Alice1","amyvalue1");
        myHash.put("Alice2","amyvalue2");
        myHash.put("Alice3","amyvalue3");
        myHash.put("Alice4","amyvalue4");
        myHash.put("Alice5","amyvalue5");
        myHash.put("Alice6","amyvalue6");

        //Compare Map vs HashMap
        HashMap<String,Integer> newMap = new HashMap<>();
        newMap.put("Alice", 90);
        newMap.put("Bob", 85);
        newMap.put("Charlie", 95);
        newMap.put("Alain", 95);
        newMap.put("Lili", 95);
        newMap.put("Hash", 95);
        newMap.put("Tel", 95);

        // Iterate myHash in order
        for(Map.Entry<String,String> entry: myHash.entrySet())
        {
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.println("Key-value:"+ Key + " - " + Value);
        }
        for(Map.Entry<String,Integer> entry: newMap.entrySet())
        {
            String Key = entry.getKey();
            Integer Value = entry.getValue();
            System.out.println("Key-value:"+ Key + " - " + Value);
        }


    }
}
