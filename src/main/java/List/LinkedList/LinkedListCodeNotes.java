package List.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // It is not based on an array hence no default size
        // It is based on storing reference of various nodes
        // Good for add and remove operation in the middle.
        // Bad for reading
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Declaration using another collection
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//
//        System.out.println("Array List - " + arrayList);
//        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
//        System.out.println("Linked List - " + linkedList);


        // Getting size of a LinkedList
        System.out.println("Linked List Size - " + linkedList.size());

        // Adding Elements to the LinkedList
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Linked List - " + linkedList);

        // Getting Element at a particular Index in a Linked List
        System.out.println("Element at index 3 in Linked List - " + linkedList.get(3));

        // Getting Size of a Linked List
        System.out.println("Linked List Size - " + linkedList.size());

        // Setting element at a certain index -
        linkedList.set(1, 100);
        System.out.println("Linked List - " + linkedList);

        // Checking if an element exists in LinkedList -
        System.out.println("Linked List Contains 4 - " + linkedList.contains(4));

        // Removing Element from a LinkedList -
        linkedList.remove(4); // Removing 4th index
        System.out.println("Linked List - " + linkedList);

        linkedList.removeFirst(); // Removes Head
        System.out.println("Linked List - " + linkedList);

        linkedList.removeLast(); // Removes Last Element
        System.out.println("Linked List - " + linkedList);

        // Clear All Element from Linked List
        linkedList.clear();
        System.out.println("Linked List - " + linkedList);


        // Iterating Over a Linked List
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Iterating using For Loop");
        for(int i=0; i<linkedList.size(); i++) {
            System.out.println("Element at Index - " + i + " - " + linkedList.get(i)); // Iterates to get to this index (Never use this loop in linked list)
        }

        System.out.println("Iterating using Enhanced for Loop");
        for(Integer elem : linkedList) {
            System.out.println("Element in Linked List - " + elem);
        }

        System.out.println("Iterating using Iterator");
        Iterator<Integer> it = linkedList.iterator();
        while(it.hasNext()) {
            System.out.println("Element in Linked List - " + it.next());
        }

        System.out.println("Iterating using ListIterator");
        ListIterator<Integer> listIt = linkedList.listIterator();
        while(listIt.hasNext()) {
            System.out.println("Element in Linked List - " + listIt.next());
        }

        // After traversing once, the Iterator is now at the end hence we can do an additional thing
        // in listIterator which we can't do in normal Iterator (Traversing Backwards)
        // listIterator is bidirectional

        while(listIt.hasPrevious()) {
            System.out.println("Element in Linked List in reverse Order - " + listIt.previous());
        }

        // Lambda function in Linked List using RemoveIf
        linkedList.removeIf(n -> (n % 2 == 0));

        System.out.println("Linked List - " + linkedList);
    }
}
