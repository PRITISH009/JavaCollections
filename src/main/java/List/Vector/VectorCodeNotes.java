package List.Vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Similar to ArrayList
        // Default capacity 10
        // Synchronized and Thread Safe but slower than ArrayList. Rest all is same
        // Legacy class
        // Extends RandomAccess Interface (Marker Interface)
        Vector<Integer> vector = new Vector<>();

        // Declaration using Another Collection
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        linkedList.add(5);
//
//        Vector<Integer> vector = new Vector<>(linkedList);
//
//        System.out.println("Vector - " + vector);

        // Size and Capacity of a Vector -
        System.out.println("Vector Size - " + vector.size());
        System.out.println("Vector Capacity - " + vector.capacity());

        // Adding Elements to a Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Vector - " + vector);

        // Getting Element at a particular index
        System.out.println("Element at index 4 - " + vector.get(4));

        // Setting Element at a particular Index
        vector.set(1, 1000);

        System.out.println("Vector - " + vector);

        vector.ensureCapacity(1000);
        // Still Can't do this because of outOfBound Check enabled in set method
//        vector.set(100, 100);
//
//        System.out.println("Vector - " + vector);

        // Removing Element from a vector
        vector.remove(1);
        System.out.println("Vector - " + vector);

        // Checking if an Element Exists in a Vector
        System.out.println("Vector Contains 3 - " + vector.contains(3));

        // Removing All Elements in the vector
        vector.clear();

        // Iterating over a Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Iterating using For Loop");
        for(int i = 0; i<vector.size(); i++) {
            System.out.println("Element in Vector at index " + i + " - " + vector.get(i));
        }

        System.out.println("Iterating using Enhanced For");
        for(Integer elem: vector) {
            System.out.println("Element in Vector - " + elem);
        }

        System.out.println("Iterating using Iterator");
        Iterator<Integer> it = vector.iterator();
        while(it.hasNext()) {
            System.out.println("Element in Vector - " + it.next());
        }

        System.out.println("Iterating using ListIterator");
        ListIterator<Integer> listIt = vector.listIterator();
        while(listIt.hasNext()) {
            System.out.println("Element in Vector - " + listIt.next());
        }

        // After traversing once, the Iterator is now at the end hence we can do an additional thing
        // in listIterator which we can't do in normal Iterator (Traversing Backwards)
        // listIterator is bidirectional

        while(listIt.hasPrevious()) {
            System.out.println("Element in Vector in Reverse Order - " + listIt.previous());
        }

        // Using Lambda Function using removeIf
        vector.removeIf(n -> (n % 2 == 0)); // Removed all even elements
        System.out.println("Vector - " + vector);
    }
}
