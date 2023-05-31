class People{
    int id;
    String name;
    static String namehaha = "haha";
    public People(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void SetNamehaha(String SetName){
        namehaha=SetName;
    }
}

public class JavaMain {
    // 
    public static void main(String[] args) {

        People p1 = new People(0, "hahaah");
        People p2 = new People(1, "hahab");
        p1.SetNamehaha("newString");
        System.out.println(p2.namehaha);
    }
}