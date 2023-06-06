package BOOPs;
public class StaticClass {
    private String subject;
    public StaticClass(String subject) {

        this.subject = subject;
    }
    //nested class
    static class NestedClass{
        public static String WEBSITE = "Haha";
        public int a1=20; // Using non-static variable method/variable inside of static class
        static public void doSomething(){
            System.out.println("Do Something");
        }
    }
    public static void main(String[] args) {
        StaticClass myClass = new StaticClass("MySubject");
        NestedClass.doSomething();
//        Khởi tạo instance của static class thông qua outer class
    }
}
