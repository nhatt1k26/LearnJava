package FCollection;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass2 implements Comparable<MyClass2>{
    public int a;
    public int b;

    public MyClass2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(MyClass2 o) {
        return this.a - o.a;
    }
    @Override
    public String toString(){
        return "{a: "+a + ",b: "+b+"}";
    }
}
public class TreeMapExp {
    public static void main(String[] args) {

        // Comparable Tree Set
        TreeMap<MyClass2,String> myMap = new TreeMap<>();
        myMap.put(new MyClass2(2,5),"asd");
        myMap.put(new MyClass2(4,7),"asd");
        myMap.put(new MyClass2(7,12),"asdj");
        myMap.put(new MyClass2(1,3),"asdasd");
        myMap.put(new MyClass2(8,6),"asdasd");
        myMap.put(new MyClass2(6,9),"asdhygkuyv");
        myMap.put(new MyClass2(4,15),"asdjkhasd");
        System.out.println(myMap);

        //Comparator Tree Set
        Comparator<MyClass2> compareBValue= new Comparator<MyClass2>(){
            @Override
            public int compare(MyClass2 o1, MyClass2 o2){
                return Integer.compare(o1.b,o2.b);
            }
        };

        TreeMap<MyClass2,String> myMap2 = new TreeMap<>(compareBValue);
        myMap2.put(new MyClass2(2,5),"asd");
        myMap2.put(new MyClass2(4,7),"asd");
        myMap2.put(new MyClass2(7,12),"asdj");
        myMap2.put(new MyClass2(1,3),"asdasd");
        myMap2.put(new MyClass2(8,6),"asdasd");
        myMap2.put(new MyClass2(6,9),"asdhygkuyv");
        myMap2.put(new MyClass2(4,15),"asdjkhasd");
        System.out.println("MyMap2:");
        System.out.println(myMap2);


    }
}
