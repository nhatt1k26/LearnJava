class StaticExample {
    // Static variable
    static int staticVariable = 10;

    // Static block use to initialize or change value of static variable
    static {
        System.out.println("Static block executed.");
        staticVariable = 20;
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("Static variable value: " + staticVariable);
    }

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static nested class method called.");
        }
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable value: " + StaticExample.staticVariable);

        // Calling static method
        StaticExample.staticMethod();

        // Creating an instance of the static nested class
        StaticExample.StaticNestedClass nestedObj = new StaticExample.StaticNestedClass();
        nestedObj.display();
    }
}