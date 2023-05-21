
import java.io.*;
class MyClass {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class MyClass4 implements Serializable {
    // Class definition
}

class MyClass5 {
    private MyClass5() {
        // Private constructor
    }

    public static MyClass createObject() {
        return new MyClass();
    }
}



public class JavaOOP {
    public static void main(String[] args) {
        // Some examples of creating objects using various methods in Java:
        
        // Method 1: new keyword
        MyClass myObject = new MyClass();

        // method 2: NewInstance keyword - was deprecated
        try {
            // Create an object using the newInstance() method
            MyClass myObject1 = MyClass.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        ;

        // method 3: clone() method
        try {
            // Create an object using the clone() method
            MyClass originalObject = new MyClass();
            MyClass clonedObject = (MyClass) originalObject.clone();
        } catch (CloneNotSupportedException e1) {
            e1.printStackTrace();
        }


        //method 4: Creating an object using deserialization:
        try {
            // Serialize the object
            MyClass myObject4 = new MyClass();
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(myObject4);
            objectOut.close();
        
            // Deserialize the object
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            MyClass deserializedObject = (MyClass) objectIn.readObject();
            objectIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //method 5: Using factory method
        MyClass myObject5 = MyClass5.createObject();
    }
}
