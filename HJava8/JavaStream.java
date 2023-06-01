package HJava8;

import javax.sound.midi.Sequence;
import java.nio.file.OpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        //Empty Stream
        Stream<String> streamEmpty = Stream.empty();

        //Stream Of Collection
        Collection<String> collection = Arrays.asList("AAA", "V", "C");
        Stream<String> streamOfCollection = collection.stream();

        //Stream Of Array
        Stream<String> streamOfArray = Stream.of("A", "B", "C");
        String[] arr = new String[]{"A", "B", "C"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);

        //Stream Pipeline
        //Sequence of operation contain 3 part: source, intermediate operation, terminal operation

        // Filter Operation: eliminate elements base on certain criteria
        System.out.println("--------Filter Operation:----------");
        Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(6).forEach(System.out::println);


        //skip(): remove the first n elements of a Stream
        //limit(): reduce the size of the Stream
        System.out.println("--------Skip and Limit Operation:----------");
        List<String> data = Arrays.asList("Java", "C", "C1", "C2", "C3");
        data.stream().skip(2).limit(2).forEach(System.out::println);

        //Map : map elements to corresponding results
        System.out.println("---------------Map Operation:---------------");
        List<String> listData = Arrays.asList("Java", "NguyenDinhNhat", "ThisArray", "NguyenDinhNhat", "Nap");
        listData.stream().map(String::toUpperCase).forEach(System.out::println);

        // --------------------------------- New Content --------------------------------- //
        //Terminal operation: getResult from defined intermediate operations
        // Terminal operation return void or non-Stream object

        //Collect method: helps to collect Stream results into a Collection
        System.out.println("---------------Stream Collect Operation:---------------");
        Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> language = stream.collect(Collectors.toList());
        System.out.println(language);

        /// --------------------------------- New Content --------------------------------- //
        //Lazy Invocation
        // Rewrite this code a bit by adding a map() operation and aa terminal operation, findFirst()
        System.out.println("-----------Lazy Invocation:--------------------------- ");
        List<String> listStream = Arrays.asList("2asd","2","2","asdjhf2","asjdk","asjdk");
        Optional<String> newStream = listStream.stream().filter(element -> {
            System.out.println("Filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("Map() was called");
            return element.toUpperCase();
        }).findFirst();

        System.out.println(newStream);

        // --------------------------------- New Content --------------------------------- //
        //Java Optional is a container class which is used to
        // contain a single value of either a primitive type or an object type, that may or may not be present.
        System.out.println("-----------Java Optional:--------------------------- ");
        Optional<String> empty = Optional.empty();
        boolean isPresent = empty.isPresent();
        System.out.println("isPresent: "+isPresent);

        // isPresent() method is used to check is the wrapped object has a value other than null
        Optional<String> optional = Optional.of("hahaa");
//        Optional<String> optional1 = Optional.of(null); //NullPointerException
        String name =null;
        Optional<String> opt = Optional.ofNullable(name);
        boolean isPresentNull = !opt.isPresent();
        System.out.println("Optional Null Object:"+ isPresentNull);

        //Conditional Action With ifPresent()
        System.out.println("-----------Conditional Action:--------------------------- ");
        Optional<String> opt1 = Optional.empty();
        opt1.ifPresent(s -> System.out.println(s.length()));


    }
}
