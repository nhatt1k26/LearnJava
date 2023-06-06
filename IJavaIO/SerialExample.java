package IJavaIO;

import java.io.*;

class Emp implements Serializable{
    private static final long serialversionUID= 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    public Emp(int a, String name, int age,int b) {
        this.a = a;
        this.name = name;
        this.age = age;
        this.b = b;
    }
}
public class SerialExample {
    public static void printData(Emp obj1){
        System.out.println("name= " + obj1.name);
        System.out.println("age= " + obj1.name);
    }

    public static void main(String[] args) {
        Emp obj = new Emp(10,"asdasd",13,123);
        String filename = "testSerialize.txt";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
        }
        catch (IOException ex){
            System.out.println("IOException is caught");
        }
        obj = null;

        //Deserialization
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            obj =(Emp)in.readObject();

            in.close();
            file.close();
            System.out.println("anew");

        }
        catch (IOException ex){
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex){
            System.out.println("Class not found exception");
        }
    }
}
