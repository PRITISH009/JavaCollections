package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCodeNotes {
   public static void main(String[] args) {
       // Declaration
       // Default capacity is 10
       // Extends Random Access Interface (Marker Interface)
       ArrayList<Integer> list = new ArrayList<>();

       // Declaration with size
       //ArrayList<Integer> list = new ArrayList<>(50);

       // Converting another Collection to ArrayList
//       HashSet<Integer> set = new HashSet<>();
//       set.add(10);
//       set.add(100);
//       System.out.println(set);
//
//       ArrayList<Integer> list = new ArrayList<>(set);
//       System.out.println(list);


       // Getting the size
       System.out.println("List Size - " + list.size());

       // Adding Elements to the List
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       // Getting an element at a particular index
       System.out.println("Element at index 3 for List - " + list.get(3));

       System.out.println("List - " + list);

       // Removing Element at a particular index from the list
       list.remove(3);

       System.out.println("List - " + list);

       // Setting an Element at a particular index in the list
       list.set(3, 1000);

       System.out.println("List - " + list);

       // Checking if an Element Exists in Array List
       System.out.println("List Contains 1 - " + list.contains(1));

//       list.set(900, 100); // Would fail here

       // remove all elements
       list.clear();

       System.out.println("List - " + list);

       // Ensuring a minimum capacity to the list
       list.ensureCapacity(1000);
       // creates a new array of size 1000 and copies all the existing elements into it.
       // But you still can't set index greater than current size of the array list even by using ensure capacity
       // ArrayList doesn't really expose the capacity as a method but default size is 10 while initialization.
       // When filled completely, resizes the internal array to 1.5 times the current size;


       // Iterating Over List;
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       System.out.println("Iterating With For Loop");
       for(int i=0; i<list.size(); i++) {
           System.out.println("Element at index - " + i + " - " + list.get(i));
       }

       System.out.println("Iterating using Enhanced For");
       for(Integer elem: list) {
           System.out.println("Element in List - " + elem);
       }

       System.out.println("Iterating using Iterator");
       Iterator<Integer> it = list.iterator();
       while(it.hasNext()) {
           System.out.println("Element in List - " + it.next());
       }

       System.out.println("Iterating Using List Iterator");
       ListIterator<Integer> listIt = list.listIterator();

       while(listIt.hasNext()) {
           System.out.println("Element in List - " + listIt.next());
       }

       // After traversing once, the Iterator is now at the end hence we can do an additional thing
       // in listIterator which we can't do in normal Iterator (Traversing Backwards)
       // listIterator is bidirectional
       while(listIt.hasPrevious()) {
           System.out.println("Element in List in Reverse Order - " + listIt.previous());
       }

       // Using lambda function with removeIf
       list.removeIf(n -> (n % 2 == 0));

       System.out.println("Removing all Even Elements in List - " + list);

   }
}
