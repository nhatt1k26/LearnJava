package HJava8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

interface NewInterface{
    void instanceMethod(String message);
}

class MyClass{
    public static Integer doSomething(String str){
        return str.length();
    }
}

class MyClass3{
    public Integer doSomething(String str){
        return str.length();
    }
}




class MyClass5{
    public int a;
    public int b;

    public MyClass5(int a) {
        this.a = a+12;
        this.b = 10;
    }
    @Override
    public String toString(){
        return "MyClass5: "+a+" "+b;
    }
}
class MyClass4 implements NewInterface{
//    @Override
    public void instanceMethod(String message) {
        System.out.println("Instance method: " + message);
    }
}
public class MethodReferencesExp {
    public static void main(String[] args) {


        HashMap<String,Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John",String::length);
        System.out.println(value);

        //Types of Method References
        // Reference to a static method
        Integer value2 = nameMap.computeIfAbsent("Nguyen_Dinh_Nhat",MyClass::doSomething);
        System.out.println(value2);

        //Refers to an instance method of a particular object
        MyClass3 newClass = new MyClass3();
        Integer value3 = nameMap.computeIfAbsent("sdjkf",newClass::doSomething);
        System.out.println(value3);

        //Reference to an instance method of an arbitrary object of a particular type
        List<Integer> numbers = Arrays.asList(5,2,4,34,3,4,4,3,45);
        numbers.stream().sorted(Integer::compareTo);
//        Integer value4 = nameMap.computeIfAbsent("sdjkf",MyClass4::instanceMethod);
//        System.out.println(value4);

        //Reference to a Constructor
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        MyClass5[] results = intList.stream().map(MyClass5::new).toArray(MyClass5[]::new);
        for( MyClass5 itr : results)
            System.out.println("Reference to a Constructor: "+ itr);
    }
}
