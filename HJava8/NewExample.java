package HJava8;

import java.util.Optional;

public class NewExample {
    public static void main(String[] args) {
        //initialize new optional array with integer in java
        // Initialize an optional array with integers
        Optional<int[]> optionalArray = Optional.of(new int[]{1, 2, 3, 4, 5});

        // Access the array if it is present
        if (optionalArray.isPresent()) {
            int[] array = optionalArray.get();
            for (int num : array) {
                System.out.println(num);
            }
        } else {
            System.out.println("Array is not present.");
        }

        // Alternatively, you can use ifPresent() and lambda expression
        optionalArray.ifPresent(array -> {
            for (int num : array) {
                System.out.println(num);
            }
        });
    }
}

