package HJava8;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterValue {
    public static void main(String[] args) {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        //ArrayList<String> names = new ArrayList<>(List.of("asdjasd", "asdk", "a", "sdaas"));
        //Optional<Integer> yearOptional[] = Optional.of(Arrays.Listof([2016,2017,2018]));
        boolean is2016 = yearOptional.filter(y -> y==2016).isPresent();
        System.out.println(is2016);
        boolean is2017 = yearOptional.filter(y -> y==2017).isPresent();
        System.out.println(is2017);
    }
}
