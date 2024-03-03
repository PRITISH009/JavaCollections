package Map.HashMap;

import java.util.HashMap;

public class HashMapCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Default capacity 16, loadFactor 0.75
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Getting size of hashMap
        System.out.println("Size of HashMap - " + hashMap.size());

        // Adding Key Value Pais in HashMap
        hashMap.put(1, "Pritish");
        hashMap.put(2, "Kaustav");
        hashMap.put(3, "Ishan");
        hashMap.put(4, "Ronet");
        hashMap.put(5, "Sushil");
        hashMap.put(6, "Dhoot");
        hashMap.put(7, "Bharadwaj");

        System.out.println("Size of HashMap - " + hashMap.size());

        System.out.println("HashMap - " + hashMap);

    }
}
