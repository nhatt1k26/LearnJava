// Abstract class
abstract class Animal {
    protected String name;
    
    // Constructor
    public Animal(String name) {
        this.name = name;
    }
    
    //Abstract method
    public abstract void sound();
    
    // Implemented method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Interface
interface Jumpable {
    //Static Final Variable
    int a = 5;
    
    void jump();
}

// Concrete class implementing the abstract class and interface
class Dog extends Animal implements Jumpable {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(name + " is barking.");
    }
    
    @Override
    public void jump() {
        System.out.println(name + " is jumping.");
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
        dog.eat();
        dog.jump();
        System.out.println(Dog.a);
    }
}