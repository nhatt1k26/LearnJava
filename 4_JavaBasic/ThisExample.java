// Refer current class instance variables
class MyClass{
    private int a;
    private int b;
    private int c;
    public MyClass(int a){
        this(a,0,0);
        System.out.println("Construtor with one parameter.");
    }
    public MyClass(){
        System.out.println("Null-Construtor is call");
    }
    public MyClass(int a,int b,int c){
        this.a =a;
        this.b=b;
        this.c=c;
        System.out.println("Construtor with three parameter.");
    }
    
}

// Invoke current class method:
class ArgumentClass {
    public int value;
    public ArgumentClass(int value) {
        this.value = value;   
    }
    void process(ArgumentClass newArgs)
    {
        System.out.println(newArgs.value);
        System.out.println("Call invoked");
    }
    void CallProcess(){
        process(this);
        System.out.println("Called Process");
    }
}

// Return the current class instance
class Person {
    private String name;
    private int age;

    public Person() {
        this("John Doe", 30); // Invoke the parameterized constructor using 'this'
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getCopy() {
        return this; // Return the current instance of the Person class
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String newname) {
        name = newname;
    }
}

public class ThisExample {
    public static void main(String[] args){
        // ArgumentClass myClass = new ArgumentClass(20);
        // myClass.CallProcess();
        Person person = new Person();
        Person copy = person.getCopy();

        System.out.println("Name: " + copy.getName());
        System.out.println("Age: " + copy.getAge());
        copy.setName("hahaha");
        System.out.println(copy.getName());
        System.out.println(person.getName());
    }
}
