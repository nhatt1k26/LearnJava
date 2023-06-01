package HJava8;
//import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
@FunctionalInterface
interface Consumer<T>{
    void accept (T t);
}

class ForEachClass{
    public static void printString(String str){
        System.out.println("Print inside class:"+ str);
    }
}



public class CollectionForEach {
    public static void main(String[] args) {

        //Any iterable of type Collection — list, set, queue etc. — has the same syntax with for using forEach.

        ArrayList<String> names = new ArrayList<>(List.of("asdjasd", "asdk", "a", "sdaas"));
        // traditional loop
        System.out.println("-------traditional loop----");
        for (String name : names) {
            System.out.println(name);
        }
        // Collection forEach with lambda expression
        System.out.println("-------forEach loop lambda expression--------");
        names.forEach(name -> {
            System.out.println(name);
        });


        Consumer<String> printConsumer = new Consumer<String>(){
            public void accept(String name){
                System.out.println(name);
            }
        };

        // Collection forEach with Consumer interface
        System.out.println("-------forEach loop Consumer Interface--------");
        names.forEach(name -> {
            System.out.println(name);
        });

        //Collection forEach with reference
        System.out.println("-------forEach loop with function reference--------");
        names.forEach(ForEachClass::printString);

        // --------------------------------- New Content --------------------------------- //

        //forEach with Map
        System.out.println("-------forEach loop with HashMap--------");
        HashMap<String,Integer> newMaps = new HashMap<String,Integer>();
        newMaps.put("Nhat",15);
        newMaps.put("Hoang",16);
        newMaps.put("Viet",8);
        newMaps.forEach((key,value) -> System.out.println("Iterator map value: [Key:"+key+", value:"+value+"]"));

        //Using Entry Set
        System.out.println("-------forEach loop with HashMap Entry--------");
        HashMap<String,Integer> newMap2s = new HashMap<String,Integer>();
        newMap2s.put("Nhat",100);
        newMap2s.put("Hoang",160);
        newMap2s.put("Viet",800);
        newMap2s.entrySet().forEach((entry) -> System.out.println("Iterator map value: [Key:"+entry.getKey()+", value:"+entry.getValue()+"]"));

    }
}
