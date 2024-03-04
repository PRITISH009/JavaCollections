package Set.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCodeNotes {
    public static void main(String[] args) {
        // Declaration
        TreeSet<String> treeSet = new TreeSet<>();

        // Declaration using a comparator
        TreeSet<String> treeSetWithComparator = new TreeSet<>(new Comparator<String>() {
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

        treeSetWithComparator.add("Pritish");
        treeSetWithComparator.add("Aanchal");
        treeSetWithComparator.add("Ruth");
        treeSetWithComparator.add("Priyanshi");

        System.out.println("TreeSet with Comparator - " + treeSet);

        // Adding Elements to TreeSet
        treeSet.add("Pritish");
        treeSet.add("Shriyut");
        treeSet.add("Ruth");
        treeSet.add("Priyanshi");
        treeSet.add("Aanchal");

        System.out.println("TreeSet - " + treeSet);

        // Check if an element Exists in TreeSet
        System.out.println("Pritish Exists in TreeSet - " + treeSet.contains("Pritish"));
        System.out.println("Soham Exists in TreeSet - " + treeSet.contains("Soham"));

        // Getting First Element of the TreeSet
        System.out.println("First Element of TreeSet - " + treeSet.first());

        // Getting Last Element of TreeSet
        System.out.println("Last Element of TreeSet - " + treeSet.last());

        // Removing Element from TreeSet
        System.out.println("Removing Soham from TreeSet - " + treeSet.remove("Soham")); // false
        System.out.println("Removing Pritish from TreeSet - " + treeSet.remove("Pritish")); // true

        // Removing all Elements from TreeSet
        treeSet.clear();

        System.out.println("TreeSet - " + treeSet);

        // Iterating Over TreeSet
        treeSet.add("Pritish");
        treeSet.add("Shriyut");
        treeSet.add("Ruth");
        treeSet.add("Priyanshi");
        treeSet.add("Aanchal");

        // Iterating using forEach
        System.out.println("Iterating Over TreeSet using ForEach");
        //treeSet.forEach(n -> System.out.println(n));
        treeSet.forEach(System.out::println); // equivalent to above

        // Iterating using Enhanced For
        System.out.println("Iterating Over TreeSet using Enhanced For");
        for(String elem: treeSet) {
            System.out.println("Element in TreeSet - " + elem);
        }

        // Iterating using Iterator
        System.out.println("Iterating Over TreeSet using Iterator");
        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()) {
            System.out.println("Element in TreeSet - " + it.next());
        }

        // Iterating in Reverse Order
        Iterator<String> descIt = treeSet.descendingIterator();
        while(descIt.hasNext()) {
            System.out.println("Element in TreeSet in Reversed Order - " + descIt.next());
        }

        // Using RemoveIf and lambda function
        treeSet.removeIf(n -> (n.equals("Pritish") || n.equals("Ruth")));
        System.out.println("TreeSet - " + treeSet);

        // TreeMap of Class Object using Comparable
        class Person implements Comparable<Person> {
            String name;
            Integer age;

            public Person(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person(" + name + "," + age + ")";
            }

            @Override
            public int compareTo(Person o) {
                if(this.name.length() > o.name.length()) {
                    return -1;
                } else if(this.name.length() < o.name.length()) {
                    return 1;
                } else {
                    return this.name.compareTo(o.name);
                }
            }
        }

        // Able to declare because of Comparable<Person>
        TreeSet<Person> treeSetOfPerson = new TreeSet<>();
        treeSetOfPerson.add(new Person("Pritish", 25));
        treeSetOfPerson.add(new Person("Aanchal", 23));
        treeSetOfPerson.add(new Person("Ruth", 27));
        treeSetOfPerson.add(new Person("Priyanshi", 24));

        System.out.println("TreeSet of Person - " + treeSetOfPerson);

        // Get Descending TreeSet
        System.out.println("Descending TreeSet - " + treeSet.descendingSet());
    }
}
