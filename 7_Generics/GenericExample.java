import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList();
        list.add(new Integer(12));
        Integer a = list.iterator().next();
    }
}
