package Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Default size 16, Load Factor 0.75 (uses HashMap internally)
        // Insertion Order is not Preserved (Can't Guarantee)
        HashSet<String> hashSet = new HashSet<>();

        // Declaration using Another Collection
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Pritish");
//        arr.add("Pritish");
//        arr.add("Aanchal");
//        arr.add("Shriyut");
//        arr.add("Swati");
//
//        HashSet<String> hashSet = new HashSet<>(arr);
//        System.out.println("HashSet - " + hashSet);

        // Size of HashSet
        System.out.println("HashSet Size - " + hashSet.size());

        // Adding Elements to a HashSet
        hashSet.add("Pritish");
        hashSet.add("Pritish"); // Doesn't add duplicates
        hashSet.add("Aanchal");
        hashSet.add("Shriyut");
        hashSet.add("Swati");

        System.out.println("HashSet - " + hashSet);

        System.out.println("HashSet Size - " + hashSet.size());

        // Check if HashSet contains an element
        System.out.println("HashSet contains Pritish - " + hashSet.contains("Pritish"));
        System.out.println("HashSet contains Arnav - " + hashSet.contains("Arnav"));

        // Removing an Element from HashSet
        System.out.println("Removing Pritish from HashSet - " + hashSet.remove("Pritish")); // true
        System.out.println("Removing Pritish from HashSet - " + hashSet.remove("Pritish")); // false

        System.out.println("HashSet - " + hashSet);

        // Removing all elements of HashSet
        hashSet.clear();
        System.out.println("HashSet - " + hashSet);

        // Iterating over HashSet
        hashSet.add("Pritish");
        hashSet.add("Aanchal");
        hashSet.add("Shriyut");
        hashSet.add("Swati");

        // Iterating using ForEach
        //hashSet.forEach(n -> System.out.println(n)); //equivalent to below
        System.out.println("Iterating Over HashSet using ForEach");
        hashSet.forEach(System.out::println);

        // Iterating using Enhanced for
        System.out.println("Iterating Over HashSet using Enhanced For");
        for(String elem: hashSet) {
            System.out.println("Element in HashSet - " + elem);
        }

        // Iterating Using Iterator
        System.out.println("Iterating Over HashSet using Iterator");
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()) {
            System.out.println("Element in HashSet - " + it.next());
        }

        // Removing Element using removeIf and Lambda Function
        hashSet.removeIf(n -> (n.equals("Pritish") || n.equals("Shriyut")));

        System.out.println("HashSet - " + hashSet);

    }
}
