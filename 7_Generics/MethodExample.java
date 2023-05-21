import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MethodExample {
    public static <T> int count (Collection<T> collection, T itemToCount){
        int count =0;
        for(T item: collection){
            if(itemToCount.equals(item)){
                count++;
            }
        }
        return count;
    }    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("A");
        System.out.println(MethodExample.count(list,"A"));
    }
}
