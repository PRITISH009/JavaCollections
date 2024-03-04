package Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Default Size 16, Load Factor 0.75
        // Insertion order is preserved
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Declaration using another Collection
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Pritish");
//        arr.add("Pritish");
//        arr.add("Aanchal");
//        arr.add("Shriyut");
//        arr.add("Swati");
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arr);
//        System.out.println("LinkedHashSet - " + linkedHashSet);

        // Adding Elements to LinkedHashSet
        linkedHashSet.add("Pritish");
        linkedHashSet.add("Swati");
        linkedHashSet.add("Aanchal");
        linkedHashSet.add("Shriyut");

        System.out.println("LinkedHashSet - " + linkedHashSet);

        // Checking If an element exists in LinkedHashSet
        System.out.println("LinkedHashSet Contains Pritish - " + linkedHashSet.contains("Pritish")); // true
        System.out.println("LinkedHashSet Contains Arnav - " + linkedHashSet.contains("Arnav")); // false

        // Removing Element from LinkedHashSet
        System.out.println("Removing Pritish from LinkedHashSet - " + linkedHashSet.remove("Pritish")); // true
        System.out.println("Removing Pritish from LinkedHashSet - " + linkedHashSet.remove("Pritish")); // false (as it doesn't exist)

        // Removing all the elements in the LinkedHashSet
        linkedHashSet.clear();

        System.out.println("Linked HashSet - " + linkedHashSet);

        // Iterating Over LinkedHashSet
        linkedHashSet.add("Pritish");
        linkedHashSet.add("Swati");
        linkedHashSet.add("Aanchal");
        linkedHashSet.add("Shriyut");

        // Iterating Using Foreach
        System.out.println("Iterating Using ForEach");
        //linkedHashSet.forEach(n -> System.out.println(n));
        linkedHashSet.forEach(System.out::println); // equivalent to above

        // Iterating over Linked HashSet using Enhanced For
        System.out.println("Iterating Over LinkedHashSet using Enhanced For");
        for(String elem: linkedHashSet) {
            System.out.println("Element in LinkedHashSet - " + elem);
        }

        // Iterating Over LinkedHashSet using Iterator
        Iterator<String> it = linkedHashSet.iterator();
        while(it.hasNext()) {
            System.out.println("Element in LinkedHashSet - " + it.next());
        }

        // Using RemoveIf and Lambda Function in LinkedHashSet
        linkedHashSet.removeIf(n -> (n.equals("Pritish") || n.equals("Aanchal")));

        System.out.println("LinkedHashSet - " + linkedHashSet);
    }
}
