class MyClass{
    //Class doesnt have No-argument construtor and Parameterized constructor will have default constructor create automatically by Java Compiler
}

class MyClass2{
    public int value;
    public MyClass2(int value){
        this.value = value;
    }
}

class MyClass3{
    public int value;
    public MyClass3(){
        value = 12;
    }
}
public class Constructor {
    public static void main(String[] args) {
        
        //Default Constructor
        MyClass myClass = new MyClass();

        // Class have No-argument construtor and Parameterized constructor can not create new Object with default constructor
       // MyClass2 myClass2 = new MyClass2();

        //Parameterized Constructor
        MyClass2 myClass2 = new MyClass2(2);

        //No-argument constructor
        MyClass3 myClass3 = new MyClass3();

        System.out.println("New Class:" +myClass+ myClass2 + myClass3);
    }
}
