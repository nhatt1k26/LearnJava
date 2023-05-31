import java.util.ArrayList;
import java.util.List;

class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class WildCard {
    public static void main(String[] args) {
        //Example 1
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Tom");
        listString.add("Jerry");
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        listInteger.add(123);
        listInteger.add(3872);
        ArrayList<? extends Number> listGeneric;
        listGeneric = listInteger;
        //listGeneric = listString; //Error: String is not extends of Number type

        // listGeneric.add("asd");   Error: Cannot add elements to a wildcarded list
        // for (Object e: listInteger)
        //     listGeneric.add(e);


        //Example 2
        System.out.println(listGeneric);
        System.out.println("Print listString");
        PrintElement(listString);
        System.out.println("Print listInteger");
        PrintElement(listInteger);


        //Example 3 
        List<? super Animal> animalList = new ArrayList<>();

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animalList.add(animal); // ????
        animalList.add(dog); // Valid 
        animalList.add(cat);

        Object obj = animalList.get(0); // Retrieve an object as an Object reference
       // Animal animalRef = (Animal) animalList.get(0); // Compilation error - Cannot assign Object to Animal reference
       // Dog dogRef = animalList.get(0); // Compilation error - Cannot assign Object to Dog reference

        animalList.forEach(animalObj -> {
            Animal animalRef = (Animal) animalObj; // Type casting required to use Animal reference
            animalRef.eat();
            // animalRef.bark(); // Compilation error - Animal reference cannot access Dog-specific method
        });


    }
    public static void PrintElement(List<?> list){
        for (Object e: list)
             System.out.println(e);
    }
}




