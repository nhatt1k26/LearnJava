package FCollection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Element 1");
            list.add("Element 2");
            list.add("Element 3");

            // Example using Iterator
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            System.out.println("------------------------");

            // Example using ListIterator
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                String element = listIterator.next();
                listIterator.add("hahaha"); //Adding new element
                System.out.println(element);
            }

            System.out.println("------------------------");

            // Example using ListIterator in reverse
            while (listIterator.hasPrevious()) {
                String element = listIterator.previous();
                System.out.println(element);
            }
        }
    }
