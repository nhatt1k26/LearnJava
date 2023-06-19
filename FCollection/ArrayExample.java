package FCollection;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.*;
import java.util.stream.Stream;

public class ArrayExample {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(5, 9, 2, 7, 3, 6);

        Optional<Integer> maxElement = stream.max(Integer::compareTo);
        stream = Stream.of(5, 9, 2, 7, 3, 6);  // Reset the stream

        Integer secondMaxElement = stream.filter(e -> !e.equals(maxElement.orElse(null)))
                .max(Comparator.naturalOrder())
                .orElse(null);


    }
}
