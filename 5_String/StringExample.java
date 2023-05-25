
public class StringExample {
    public static void main(String[] args) {

        // String is mutable

        // Declare New String using string literal
        String a = "Hello";

        // If we declare new string with the same
        String b = new String("Hello");

        // Compare reference
        System.out.println("a==b? " + (a == b));

        // compare value
        System.out.println("value of a = b? " + a.equals(b));

        // We again declare string using "new" keyword, then reference variable will not
        // equal
        String b1 = new String("Hello");
        System.out.println("b==b1? " + (b == b1));

        a = "asdks";
        System.out.println(a);
    }
}
