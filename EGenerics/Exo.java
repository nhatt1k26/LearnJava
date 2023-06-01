package EGenerics;

import java.util.ArrayList;
import java.util.List;

class MyClass <T> {
    List<T> list = new ArrayList();

    public MyClass() {
        //this.list = list;
    }
    public void addElement(T obj){
        list.add(obj);
    }
}
public class Exo {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.addElement("asdh");
    }

}
