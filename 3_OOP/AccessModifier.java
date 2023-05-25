import com.example.mycode.*;

class MyClass extends NewPackage{
    public int a;
    private int b;
    protected int c;
    int d;
    public void GetVariable(){
        System.out.println("Same Class: "+a+b+c+d);
    }
}
class MyClass2{
    public int a;
    private int b;
    protected int c;
    int d;
    public void GetVariable(){
        System.out.println("Same Class: "+a+b+c+d);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        NewPackage myClass = new NewPackage();
        MyClass2 myClass2 = new MyClass2();
        myClass2.GetVariable();
        System.out.println("Same package: "+ myClass2.a + myClass2.c + myClass2.d);
        // System.out.println("Different Package subclass: " +  myClass.a2 + myClass.c2 + myClass.d2 );
        System.out.println("Different Package non-subclass: "+ myClass.a2 );
    }
}
