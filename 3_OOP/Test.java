class NewObject{
    public int value;
    public NewObject(int value){
        this.value = value;
    }
    @Override
    public String toString(){
        return "NewValue:"+value;
    }
}
public class Test {
    public static void main(String[] args) {
        NewObject newObject = new NewObject(12);
        System.out.println(newObject);
    }
}
