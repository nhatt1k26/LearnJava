package HJava8;
import java.util.HashMap;

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
public class MethodReferencesExp {
    public static void main(String[] args) {
        HashMap<String,Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John",String::length);
        System.out.println(value);

        //Types of Method References
        // Reference to a static method
        Integer value2 = nameMap.computeIfAbsent("NguyenDinhNhat",MyClass::doSomething);
        System.out.println(value2);

        MyClass3 newClass = new MyClass3();
        Integer value3 = nameMap.computeIfAbsent("sdjkf",newClass::doSomething);
        System.out.println(value3);

    }
}
