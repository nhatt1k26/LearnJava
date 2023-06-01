package DString;

class MyClass{
    public int a1;
    public int a2;

    public MyClass(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    public boolean equals(MyClass compareClass){
        return (this.a1 == compareClass.a1) && (this.a2 == compareClass.a2);
    }
}
public class EqualExp {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(1,2);
        MyClass myClass1 = new MyClass(1,2);
        System.out.println("Compare Class by equals method: "+ (myClass.equals(myClass1)));

        System.out.println(myClass1.hashCode());

        String myStr1 = "MyString";
        String myStr2 = new String("MyString");
        String myStr3 = new String("MyString");
        System.out.println("Compare String by equals: " + myStr1.equals(myStr2));

//        System.out.println("Equals");
    }
}
