package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

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
        System.out.println("Linked List Size - " + linkedList.size());

        // Setting element at a certain index -
        linkedList.set(1, 100);

        System.out.println("Linked List - " + linkedList);

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
    }
}
