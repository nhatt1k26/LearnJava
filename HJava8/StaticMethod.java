package HJava8;

interface Vehicle{

    default void print(String printString){
        if (isValid())
            System.out.println("Vehicle printed");
    }
    static boolean isValid(){
        System.out.println("Vehicle is valid");
        return true;
    }
    void showLog();
}

class Car implements Vehicle{
    @Override
    public void showLog(){
        System.out.println("ShowLog");
        Vehicle.isValid();
    }
}
public class StaticMethod {
    public static void main(String[] args) {

    }
}
