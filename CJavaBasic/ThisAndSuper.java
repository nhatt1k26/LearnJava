package CJavaBasic;

class Animal{
    public int weight;
    public int height;

    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    public void doSomething(){
        System.out.println("Dont do anything");
    }

}

class Dog extends Animal{
    //public final int abc;
//    public Dog(int weight, int height, int scale) {
//       // abc=10;
//        this(weight, height); //Call to 'super()' must be first statement in constructor body
//    }
    public int weight;
    public Dog(int weight,int height){
        super(weight,height);
        this.weight = weight+10;
    }
    @Override
    public void doSomething(){
        super.doSomething();
        System.out.println("Bark ......");
    }

    public void printWeight(){
        System.out.println("This weight: "+weight);
        System.out.println("This weight: "+super.weight);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Animal newAnimal = new Dog(10,20);
        newAnimal.doSomething();
        Dog newDog = new Dog(10,20);
        newDog.printWeight();
        Animal newAnimal1 = (Animal)newDog;
        System.out.println(newAnimal1.weight);
    }
}
