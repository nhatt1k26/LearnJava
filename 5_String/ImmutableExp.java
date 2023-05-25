// Imutable Class

class ImmutableClass{
    private final int a;
    private final int b;

    public ImmutableClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class MutableClass implements Cloneable{
    public int a;
    public int b;

    public MutableClass(int a, int b) {
        this.a = a;
        this.b = b;
    }    

    //Why we need to throw exeption ????
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class MyClass{
    private final int a;
    private final int b;

    //  Object is consisted in field
    private final ImmutableClass subClass;

    // private final  MutableClass subClass2;  ???

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
        this.subClass = new ImmutableClass(1,2);


        // MutableClass myClass = new MutableClass(2,3);
        // try{
        //     this.subClass2 = (MutableClass) myClass.clone();
        //     System.out.println("This is my new immutable Class");
        // }
        // catch (CloneNotSupportedException e) {
        //     e.printStackTrace();
        // }
        
        System.out.println("This is my new immutable Class");

    }

    //Just have Getter, dont have Setter
    public int getA() {
        return this.a;
    }


    public int getB() {
        return this.b;
    }

    // If any field is Object, that field must also be an immutable Object or when initializing/retrieving that field we must clone another copy.
    
}
public class ImmutableExp {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(12,3);

        //interning new mthod
        String str1 = "MyString";
        String str2 = new String("MyString");
        //Step of intern
        str2 = str2.intern();
        System.out.println(str1 == str2);
    }
    
}
