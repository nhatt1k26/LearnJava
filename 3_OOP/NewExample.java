class A{
     public int a1;
     public int a2;
    public A(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    public int getA1() {
        return this.a1;
    }
    public void setA1(int a1) {
        this.a1 = a1;
    }
    public int getA2() {
        return this.a2;
    }
    public void setA2(int a2) {
        this.a2 = a2;
    }
    @Override
    public String toString(){
        return "Class A:"+a1+" "+a2;
    }
}
public class NewExample {
    public static void main(String[] args) {
        A a = new A(12,20);
        a.setA1(12);
        a.setA2(20);
        System.out.println(a);
    }
}



