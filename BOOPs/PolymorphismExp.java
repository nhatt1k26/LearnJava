package BOOPs;
class MyClass {
    int speedlimit = 90;
    public void myMethod(){
        System.out.println("Nguyen Dinh Nhat");
    }
}
class ExtendClass extends MyClass{
    @Override
    public void myMethod(){
        System.out.println("Nguyen");
    }

    public void myMethod(int a){
        System.out.println("Nguyen Dinh Nhat");
    }

    public void myMethod1(){

    }
    public String myMethod2(){
        return "asdbh";
    }

}
public class PolymorphismExp extends MyClass {
    int speedlimit = 150;

    public static void main(String args[]){
        MyClass obj0= new PolymorphismExp();


        System.out.println(obj0.speedlimit);
        PolymorphismExp obj1= new PolymorphismExp();
        System.out.println("hahaha"+("adssd"!="dsb"));
//        MyClass obj2 = (MyClass)obj1;

        System.out.println(obj1.speedlimit);
        System.out.println(((MyClass)obj1).speedlimit);
    }
}
