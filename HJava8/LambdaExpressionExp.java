package HJava8;

import java.util.HashMap;

public class LambdaExpressionExp {
    public static void main(String[] args) {
        HashMap<String,Integer> nameMap = new HashMap<>();
        nameMap.put("ashdjk",12);

        // If the specified key is not already associated with a value (or is mapped to null),
        // attempts to compute its value using the given mapping function and enters it into this map unless null.
        Integer value = nameMap.computeIfAbsent("John",s ->s.length());
        System.out.println(value);
    }
}
