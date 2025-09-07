package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterationExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));

        // 1. Using a for loop
        System.out.println("Using a for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. Using an enhanced for-each loop
        System.out.println("\nUsing an enhanced for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }

        // 3. Using an Iterator
        System.out.println("\nUsing an Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Using a ListIterator for bidirectional iteration
        System.out.println("\nUsing a ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 5. Using Java Streams
        System.out.println("\nUsing Java Streams:");
        list.stream().forEach(System.out::println);

        // 6. Using forEach with Lambda
        System.out.println("\nUsing forEach with Lambda:");
        list.forEach(item -> System.out.println(item));

        // 7. Using forEachRemaining with Iterator
        System.out.println("\nUsing forEachRemaining with Iterator:");
        Iterator<String> it = list.iterator();
        it.forEachRemaining(System.out::println);
    }
}

