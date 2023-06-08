package HJava8;

public class NewExp1{
    public static void main(String[] args) {
       MyNewClass myNewClass1 =  new MyNewClass1();
       myNewClass1.doSomething();
    }
}

class MyNewClass  {
    static void doSomething(){
        System.out.println("MyNewClass method");
    }
}

class MyNewClass1 extends MyNewClass  {
    static void doSomething(){
        System.out.println("MyNewClass1 method");
    }
}
