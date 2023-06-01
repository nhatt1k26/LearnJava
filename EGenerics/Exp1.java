package EGenerics;
class MyNewClass<T>{
    T[] arr;
    public MyNewClass(T[] arr) {
        this.arr = arr;
    //(T[]) new Object[size]; // Error
    }
}
public class Exp1 {
    public static void main(String[] args) {
        MyNewClass<String> myNewClass = new MyNewClass<>(new String[]{"a1","a2"});
        String[] myArrayString = new String[]{"A","B"};

    }
}
