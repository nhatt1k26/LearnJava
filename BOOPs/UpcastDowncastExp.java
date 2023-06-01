package BOOPs;

import java.util.ArrayList;

interface Food {
    float getTotalCalories();

    String getOrigin();
}

abstract class Fruit implements Food {
    abstract protected String getName();
}

class Apple extends Fruit {
    public float getTotalCalories() {
        return 0.40f;
    }

    public String getOrigin() {
        return "AppleCity";
    }

    @Override
    protected String getName() {
        return "Apple";
    }

    public String getColorApple(){
        return "Red";
    }
}

class Orange extends Fruit {
    public float getTotalCalories() {
        return 0.30f;
    }

    public String getOrigin() {
        return "OrangeCity";
    }

    @Override
    protected String getName() {
        return "Orange";
    }

}

public class UpcastDowncastExp {
    public static void main(String[] args) {
        //Upcasting
//        Fruit fruit = new Apple();
//        Apple castedApple = (Apple) fruit;


        // Cause ClassCastException when downcasting
//        Fruit fruit = new Orange();
//        Apple apple = (Apple) fruit;

        // Use instance of cho check whether class instanceof another class
        Fruit fruit = new Orange();
        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit;

        } else {
            System.out.println("Can't cast");
        }


        //Why we need upcasting : use polymorphism, a List of reference can refer to all type of object subclass
        // Why do not have to clarify declare datatype for each subclass but still can use method define for each type of subclass
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Apple());
        fruitList.add(new Orange());
        for (Fruit itr : fruitList)
            System.out.println(itr.getName());

        // We use downcasting when we need some method that dont have in superclass
        int count = 0 ;
        for (Fruit objItr : fruitList)
           if (objItr instanceof Apple)  {
               System.out.println("Number of Apple:" + (++count));
               Apple newObj = (Apple)objItr;
               System.out.println(newObj.getColorApple());
           }

    }
}
