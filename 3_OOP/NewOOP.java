
class ClassB {
    public int a;
  
    public static void newVoid(){
        ClassB classB = new ClassB();
        System.out.println(classB.a);
        System.out.println("NewVoid");
    }
}
public class NewOOP {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        //classB.a;
        int c= classB.a;
        System.out.println(c);
    }
}
