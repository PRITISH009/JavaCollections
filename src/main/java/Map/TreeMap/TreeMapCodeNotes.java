package Map.TreeMap;

import java.util.*;

public class TreeMapCodeNotes {
    public static void main(String[] args) {

        // Declaration
        // Doesn't Retain Insertion order -  orders elements with respect to some sorting order
        // Default sorting order is based on Key
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // With default sorting order

        // Getting size of TreeMap
        System.out.println("Size of TreeMap - " + treeMap.size());

        // Adding Elements to TreeMap
        treeMap.put(1, "Pritish");
        treeMap.put(2, "Shriyut");
        treeMap.put(3, "Arnav");
        treeMap.put(4, "Aanchal");
        treeMap.put(5, "Swati");
        treeMap.put(6, "Rizo");

        System.out.println("TreeMap - " + treeMap);
        System.out.println("Size of TreeMap - " + treeMap.size());

        // Checking if a key exists in treeMap
        System.out.println("Check if Key 1 exists in Tree Map - " + treeMap.containsKey(1)); // returns true
        System.out.println("Check if Key 10 exists in Tree Map - " + treeMap.containsKey(10)); // returns false

        // Get Value for a key in TreeMap
        System.out.println("Getting Value for Key 1 in Tree Map - " + treeMap.get(1)); // Returns Pritish
        System.out.println("Getting Value for Key 10 in Tree Map - " + treeMap.get(10)); // Returns null

        // Removing an Element from the TreeMap using Key
        System.out.println("Removing key 3 from TreeMap - " + treeMap.remove(3)); // Returns Arnav
        System.out.println("Removing key 10 from TreeMap - " + treeMap.remove(10)); // Returns null

        // Removing an Element from TreeMap using Key and Object
        System.out.println("Removing key 1 from TreeMap - " + treeMap.remove(1, "Pritish")); // Returns true
        System.out.println("Removing key 1 from TreeMap - " + treeMap.remove(1, "Pritish")); // Returns false (doesn't exist)

        // Getting Keys in TreeMap
        Set<Integer> keys = treeMap.keySet();
        System.out.println("Keys of TreeMap - " + keys);

        // Get Descending Key Set in TreeMap
        Set<Integer> descendingKeys = treeMap.descendingKeySet();
        System.out.println("Descending KeySet - " + descendingKeys);

        // Getting all values of a TreeMap
        Collection<String> treeMapValues = treeMap.values();
        System.out.println("Values of TreeMap - " + treeMapValues); // Can be converted to any Collection
        ArrayList<String> treeMapValuesAsList = new ArrayList<>(treeMapValues);
        System.out.println("TreeMap Values as ArrayList - " + treeMapValuesAsList);

        // Get Descending values in TreeMap
        Collection<String> descendingKeyValues = treeMap.descendingMap().values();
        System.out.println("Descending Values of TreeMap - " + descendingKeyValues);
        ArrayList<String> descendingValuesAsList = new ArrayList<>(descendingKeyValues);
        System.out.println("Descending TreeMap Values as ArrayList - " + descendingValuesAsList);

        // Getting a Reversed TreeMap
        TreeMap<Integer, String> reversedTreeMap = new TreeMap<>(treeMap.descendingMap());
        System.out.println("Reversed Tree Map - " + reversedTreeMap);

        // Getting First Key of TreeMap
        System.out.println("First Key of TreeMap - " + treeMap.firstKey());
        System.out.println("First Key of Reversed TreeMap - " + reversedTreeMap.firstKey());

        // Getting First entry of TreeMap
        System.out.println("First Entry of TreeMap - " + treeMap.firstEntry());
        System.out.println("First Entry of Reversed TreeMap - " + reversedTreeMap.firstEntry());

        // Getting Last Key from TreeMap
        System.out.println("Last Key from TreeMap - " + treeMap.lastKey());
        System.out.println("Last Key from Reversed TreeMap - " + reversedTreeMap.lastKey());

        // Getting Last Entry of TreeMap
        System.out.println("Last Entry of Tree Map - " + treeMap.lastEntry());
        System.out.println("Last Entry of Reversed Tree Map - " + reversedTreeMap.lastEntry());

        // Using Comparators
        class Person {
            String firstName;
            String lastName;
            Integer id;

            @Override
            public String toString() {
                return "Person(" + firstName + "," + lastName + "," + id + ")";
            }

            public Person(String firstName, String lastName, Integer id) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.id = id;
            }
        }

        // TreeMap with Reverse order Comparator (Using Comparator with compare with Keys in this case
        TreeMap<Integer, Person> personTreeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                } else if(o1 < o2) {
                    return +1;
                } else {
                    return 0;
                }
            }
        });

        personTreeMap.put(1, new Person("Pritish", "Gupta", 1));
        personTreeMap.put(2, new Person("Prakshi", "Goyal", 2));
        personTreeMap.put(3, new Person("Ganesh", "Kumar Sharma", 3));
        personTreeMap.put(4, new Person("Muskan", "Bansal", 4));

        System.out.println("Person Tree Map - " + personTreeMap);

        TreeMap<String, Person> personTreeMapWithNameKey = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if(o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        personTreeMapWithNameKey.put("Pritish", new Person("Pritish", "Gupta", 1));
        personTreeMapWithNameKey.put("Shriyut", new Person("Shriyut", "Khumbhkar", 2));
        personTreeMapWithNameKey.put("Arnav", new Person("Arnav", "Kesharwani", 3));

        // Sorted on length of key first then it will compare lexographically Key String
        System.out.println("PersonTreeWithNameKey - " + personTreeMapWithNameKey);

        // Using Comparable Interface

        // Using Comparable Interface will not make any sense or difference as the objects in hashmap are compared
        // on keys not values

//        class Student implements Comparable<Student> {
//            String firstName;
//            String lastName;
//            Integer id;
//
//            public Student(String firstName, String lastName, Integer id) {
//                this.firstName = firstName;
//                this.lastName = lastName;
//                this.id = id;
//            }
//
//            @Override
//            public String toString() {
//                return  "Student(" + firstName + "," + lastName + "," + id + ")";
//            }
//
//            @Override
//            public int compareTo(Student o) {
//                if(this.firstName.length() > o.firstName.length()) {
//                    return 1;
//                } else if(this.firstName.length() < o.firstName.length()) {
//                    return -1;
//                } else {
//                    return (this.id > o.id) ? -1 : 1;
//                }
//            }
//        }
//
//        TreeMap<String, Student> studentTreeMap = new TreeMap<>();
//
//        studentTreeMap.put("Pritish", new Student("Pritish", "Gupta", 1));
//        studentTreeMap.put("Prakshi", new Student("Prakshi", "Goyal", 2));
//        studentTreeMap.put("Ganesh", new Student("Ganesh", "Kumar Sharma", 3));
//        studentTreeMap.put("Muskan", new Student("Muskan", "Bansal", 4));
//
//        System.out.println("Student Tree Map - " + studentTreeMap);

    }
}
