package BOOPs;

interface MyInterface{
    static final int a1 =10; //
    int b2 =20; // = static final int b2=20;

}



class M1 implements MyInterface{
    int a1=14;
    static void doSomething(){
        System.out.println(b2);
    }
    void doSomething1(){
        System.out.println("Call method doSomething1");
        doSomething();
    }
}
class MyClass1{
    public static int a1 = 0;
    public static int a2 = 0;
    private static int a3 = 10;

    static {
        a1=10;
        a2=10;
        System.out.println("Haha");
    }
    static void myMethod(){
        int a3 = a1+a2;
        System.out.println(a3);
        System.out.println("Hello new val");
    }
}

public class StaticExp {
    private static String subject;

    static {
        System.out.println("Block static was called");
    }

    static {
        subject = "static blocks";
    }

    StaticExp () {
        System.out.println("hàm main() được gọi");
        System.out.println("Subject = " + subject);
    }
    public static void main(String[] args) {
        // Static and final method in https://gpcoder.com/2272-tu-khoa-static-va-final-trong-java/
        MyClass1.myMethod();
        System.out.println("Hello main 1");

        // --------------------------------- New Content --------------------------------- //

        // In interface, the default variable is public static final.
        System.out.println("---------------Interface-----------------");
        M1 myObject = new M1();
        myObject.doSomething1();

        // --------------------------------- New Content --------------------------------- //
        System.out.println("---------------Static block-----------------");
        StaticExp ex1 = new StaticExp();

    }
}
