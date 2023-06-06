package HJava8;
@FunctionalInterface
interface FI1{
    void doSomething();
//    void doSomethingAndSomeone();
}
@FunctionalInterface
interface FI2{
    void doSomething();
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        FI1 instance1 = ()-> {
            System.out.println("hello World");
        };


        FI2 instance2 = new FI2(){
            @Override
            public void doSomething(){
                System.out.println("FI2 do something");
            }
            @Override
            public int hashCode() {
                System.out.println("HashCode");
                return 12323;
            }
        };

        instance1.doSomething();
        instance2.doSomething();
        System.out.println("Boolean result " + instance2.toString());
        //instance.toString();
    }
}
