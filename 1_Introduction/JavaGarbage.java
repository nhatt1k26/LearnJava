public class JavaGarbage {
    public static void main(String[] args) {
        // Nulling the reference
        MyClass obj1 = new MyClass(1);
        obj1 = null;

        //By assigning a reference to another
        MyClass obj2 = new MyClass(2);
        obj2 = obj1;

        //anonymous object
        new MyClass(3);

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
    int id;
    // Constructor
    public MyClass(int id) {
        this.id = id;
        // System.out.println("Creating an object.");
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing an object" + id);
    }
}
