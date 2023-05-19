
// Reference Type
public class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    public void updateValue(int newValue) {
        this.value = newValue;
    }
}

public class Main {
    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass(10);
        System.out.println("Initial value: " + obj.value);  

        updateValue(obj);
        System.out.println("Updated value: " + obj.value);  
    }

    public static void updateValue(ExampleClass newobj) {
        newobj.updateValue(20);
    }
}



// Value Type
public class Main {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("Initial value: " + value);  // Kết quả: Initial value: 10

        updateValue(value);
        System.out.println("Updated value: " + value);  // Kết quả: Updated value: 10
    }

    public static void updateValue(int val) {
        val = 20;
    }
}

