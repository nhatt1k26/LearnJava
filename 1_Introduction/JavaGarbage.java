public class JavaGarbage {
    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Assign obj2 to obj1, obj1 no longer references the original object
        obj1 = null;

        // Assign null to obj2, obj2 no longer references the original object
        obj2 = null;

        // Request garbage collection
        System.gc();

        // Print a message to indicate when the garbage collection occurs
        System.out.println("Garbage collection requested.");

       // Wait for a short period to observe the garbage collection process
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    // Constructor
    public MyClass() {
        System.out.println("Creating an object.");
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing an object.");
    }
}