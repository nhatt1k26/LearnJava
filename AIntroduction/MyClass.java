package AIntroduction;

public class MyClass {
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
