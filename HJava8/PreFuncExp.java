package HJava8;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Function;

public class PreFuncExp {
    public static void main(String[] args) {

        //Represents a predicate (a boolean-valued function) that takes an argument of type T and returns a boolean result.
        Predicate<String> predicate = s -> s.length() > 5;
        boolean result = predicate.test("Hello World");
        System.out.println(result);  // Output: true

        //Represents an operation that takes an argument of type T and performs some action on it without returning any result.
        Consumer<String> consumer = s -> System.out.println("Hello " + s);
        consumer.accept("John");  // Output: Hello John

        //Represents a function that takes an argument of type T and returns a result of type R.

        Function<Integer, String> function = i -> "Number: " + i;
        String result0 = function.apply(42);
        System.out.println(result0);  // Output: Number: 42

        //Represents an operation that takes an argument of type T and performs some action on it without returning any result.
        Supplier<Double> supplier = Math::random;
        double result1 = supplier.get();
        System.out.println(result1);  // Output: a random number

        //Represents an operation on a single operand of type T that produces a result of type T.
        UnaryOperator<Integer> operator = x -> x * x;
        int result2 = operator.apply(5);
        System.out.println(result2);  // Output: 25
    }
}
