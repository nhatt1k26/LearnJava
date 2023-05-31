class MyClass <T>{
    private T[] array;
    
    public MyClass(int size){
        //array = new T[size]; //Compile Error
        array = (T[]) new Object[size];
    }

    public void SetArray(int index, T value){
        array[index] = value;
    }

    public T GetArray(int index)
    {
        return array[index];
    }
}
public class GenericArray {
    
    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass(20);
        myClass.SetArray(0,10);
        myClass.SetArray(1,20);
        myClass.SetArray(2,30);
        myClass.SetArray(3,40);
         System.out.println(myClass.GetArray(2));
    }
}

