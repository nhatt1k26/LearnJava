package HJava8;
interface Interface1{
    default void doSomething(){
        System.out.println("I1");
    }
}

interface Interface2{
    default  void doSomething(){
        System.out.println("I2");
    }
}

//class MyClass implements Interface1,Interface2{
//    //Compilation error: MyClass inherits unrelated defaults for method()
//}

class MyClass1 implements Interface1, Interface2 {
    // implement by override new method
    @Override
    public void doSomething() {
        System.out.println("MyClass");
    }
}

class MyClass2 implements Interface1, Interface2 {
    // implement by invoke method from super class
    @Override
    public void doSomething() {
        Interface1.super.doSomething();
        Interface2.super.doSomething();

    }
}

public class DefaultMethodInherit {
    public static void main(String[] args) {
        MyClass2 myClass = new MyClass2();
        myClass.doSomething();
    }
}
