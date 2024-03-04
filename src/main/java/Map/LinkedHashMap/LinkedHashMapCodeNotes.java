package Map.LinkedHashMap;

import java.util.*;

public class LinkedHashMapCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Default Size 16, load factor - 0.75
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Declaration using another hashMap
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "Pritish");
//        hashMap.put(2, "Kaustav");
//        hashMap.put(3, "Ishan");
//        hashMap.put(4, "Ronet");
//        hashMap.put(5, "Sushil");
//        hashMap.put(6, "Dhoot");
//        hashMap.put(7, "Bharadwaj");
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
//        System.out.println("Linked HashMap - " + linkedHashMap);

        // Getting the size of a hashMap
        System.out.println("Size of a linkedHashMap - " + linkedHashMap.size());

        // Adding Key Value Pairs to Linked HashMap
        linkedHashMap.put(1, "Pritish");
        linkedHashMap.put(2, "Ruth");
        linkedHashMap.put(4, "Akshat");
        linkedHashMap.put(5, "Muskan");
        linkedHashMap.put(3, "Priyanshi"); // Insertion order is preserved
        linkedHashMap.put(6, "Alok");
        linkedHashMap.put(7, "Uma");

        System.out.println("LinkedHashMap - " + linkedHashMap);
        System.out.println("Size of a linkedHashMap - " + linkedHashMap.size());

        // Getting a value from Linked Hash Map
        System.out.println("Value for key 1 " + linkedHashMap.get(1));

        // Removing a key from LinkedHashMap
        System.out.println("Removing Element with key 4 - " + linkedHashMap.remove(4)); // returns value
        System.out.println("Removing Element with key 4 - " + linkedHashMap.remove(4)); // returns null

        System.out.println("Removing Key Value Pair 1, Pritish - " + linkedHashMap.remove(1, "Pritish")); // true
        System.out.println("Removing Key Value Pair 1, Pritish - " + linkedHashMap.remove(1, "Pritish")); // false as doesn't exist anymore

        // Checking if a key exists in LinkedHashMap
        System.out.println("Checking if key 2 exists in Linked HashMap - " + linkedHashMap.containsKey(2)); // true
        System.out.println("Checking if key 1 exists in Linked HashMap - " + linkedHashMap.containsKey(1)); // false
        System.out.println("Checking if Value Pritish exists in Linked HashMap - " + linkedHashMap.containsValue("Pritish")); // false
        System.out.println("Checking if Value Priyanshi exists in Linked HashMap - " + linkedHashMap.containsValue("Priyanshi")); // false

        // Getting Key set of a Linked HashMap
        Set<Integer> keys = linkedHashMap.keySet();
        System.out.println("Keys of LinkedHashMap - " + keys);

        // Getting all Values of a HashMap
        Collection<String> hashMapValues=  linkedHashMap.values(); // returns collection, can be mapped to any collection
        System.out.println("Values of a LinkedHashMap - " + hashMapValues);
        ArrayList<String> hashMapValuesArrayList = new ArrayList<>(hashMapValues);
        System.out.println("Values of a LinkedHashMap as ArrayList - " + hashMapValuesArrayList);

        // Removing All elements of a hashMap
        linkedHashMap.clear();

        System.out.println("LinkedHash Map - " + linkedHashMap);

        // Iterating Over key value pairs of a hashMap using enhanced for loop (normal for cannot be applied)
        linkedHashMap.put(1, "Pritish");
        linkedHashMap.put(2, "Ruth");
        linkedHashMap.put(4, "Akshat");
        linkedHashMap.put(5, "Muskan");
        linkedHashMap.put(3, "Priyanshi"); // Insertion order is preserved
        linkedHashMap.put(6, "Alok");
        linkedHashMap.put(7, "Uma");

        System.out.println("Iterating over hashMap using Enhanced For");
        for(Map.Entry<Integer, String> mapElement: linkedHashMap.entrySet()) {
            System.out.println("Key - " + mapElement.getKey() + " Value - " + mapElement.getValue());
        }

        // Iterating using iterator
        System.out.println("Iterating over hashMap using Iterator");
        Iterator<Map.Entry<Integer, String>> it = linkedHashMap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Key - " + entry.getKey() + " Value - " + entry.getValue());
        }

        // Using ForEach with Lambda Function
        System.out.println("Iterating Over hashMap using forEach Loop with Lambda Function");
        linkedHashMap.forEach((k, v) -> System.out.println("Key - " + k + " Value - " + v));

    }
}
