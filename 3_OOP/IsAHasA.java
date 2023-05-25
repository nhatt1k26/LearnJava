// Example of "is-a" relationship (inheritance)
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Example of "have-a" relationship (composition)
class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Car is running.");
    }
}

class Engine {
    public void start() {
        System.out.println("Engine is starting.");
    }
}

// Usage
public class IsAHasA {
    public static void main(String[] args) {
        // "is-a" relationship
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();

        // "have-a" relationship
        Car car = new Car();
        car.start();
    }
}