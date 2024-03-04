package Map.HashMap;

import java.util.*;

public class HashMapCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Default capacity 16, loadFactor 0.75
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Getting size of hashMap
        System.out.println("Size of HashMap - " + hashMap.size());

        // Adding Key Value Pais in HashMap
        hashMap.put(1, "Pritish");
        hashMap.put(3, "Ishan");
        hashMap.put(4, "Ronet");
        hashMap.put(2, "Kaustav");
        hashMap.put(5, "Sushil");
        hashMap.put(6, "Dhoot");
        hashMap.put(7, "Bharadwaj");
        hashMap.put(8, "Saumay");

        System.out.println("Size of HashMap - " + hashMap.size());
        System.out.println("HashMap - " + hashMap);

        // Getting a value from hashMap using Key
        System.out.println("Value for key 1 " + hashMap.get(1));

        // Remove A Key Value pair in HashMap using Key
        System.out.println("Remove Key 7 from HashMap - " + hashMap.remove(7)); // Returns value
        System.out.println("Remove Key 8 from HashMap - " + hashMap.remove(8)); // Returns null, since doesn't exist

        // Remove using key value pairs
        System.out.println("Remove Key Value 6, Dhoot from HashMap - " + hashMap.remove(6, "Dhoot")); // Returns true
        // Trying Again
        System.out.println("Remove Key Value 6, Dhoot from HashMap - " + hashMap.remove(6, "Dhoot")); // Returns false

        // Check if a Key Exists in hashMap
        System.out.println("HashMap contains Key 1 - " + hashMap.containsKey(1));

        // Check if a value exists in hashMap
        System.out.println("HashMap contains Value Pritish - " + hashMap.containsValue("Pritish")); // true
        System.out.println("HashMap contains Value Pritish - " + hashMap.containsValue("pritish")); // false

        // Getting the "Set" of keys of a hashMap
        Set<Integer> keys = hashMap.keySet();
        System.out.println("Keys of HashMap - " + keys);

        // Getting all Values of a HashMap
        Collection<String> hashMapValues=  hashMap.values(); // returns collection, can be mapped to any collection
        System.out.println("Values of a HashMap - " + hashMapValues);
        ArrayList<String> hashMapValuesArrayList = new ArrayList<>(hashMapValues);
        System.out.println("Values of a HashMap as ArrayList - " + hashMapValuesArrayList);

        // Removing All elements of a hashMap
        hashMap.clear();

        System.out.println("Hash Map - " + hashMap);

        // Iterating Over key value pairs of a hashMap using enhanced for loop (normal for cannot be applied)
        hashMap.put(1, "Pritish");
        hashMap.put(3, "Ishan");
        hashMap.put(4, "Ronet");
        hashMap.put(5, "Sushil");
        hashMap.put(2, "Kaustav"); // Insertion order is not preserved
        hashMap.put(6, "Dhoot");
        hashMap.put(7, "Bharadwaj");
        hashMap.put(8, "Saumay");

        System.out.println("Iterating over hashMap using Enhanced For");
        for(Map.Entry<Integer, String> mapElement: hashMap.entrySet()) {
            System.out.println("Key - " + mapElement.getKey() + " Value - " + mapElement.getValue());
        }

        // Iterating using iterator
        System.out.println("Iterating over hashMap using Iterator");
        Iterator<Map.Entry<Integer, String>> it = hashMap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Key - " + entry.getKey() + " Value - " + entry.getValue());
        }

        // Using ForEach with Lambda Function
        System.out.println("Iterating Over hashMap using forEach Loop with Lambda Function");
        hashMap.forEach((k, v) -> System.out.println("Key - " + k + " Value - " + v));


    }
}
