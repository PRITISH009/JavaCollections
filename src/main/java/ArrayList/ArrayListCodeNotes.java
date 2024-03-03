package ArrayList;

import java.util.ArrayList;

public class ArrayListCodeNotes {
   public static void main(String[] args) {
       // Declaration
       // Default capacity is 10
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

       System.out.println("List - " + list);

       // Removing Element at a particular index from the list
       list.remove(3);

       System.out.println("List - " + list);

       // Setting an Element at a particular index in the list
       list.set(3, 1000);

       System.out.println("List - " + list);

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

   }
}
