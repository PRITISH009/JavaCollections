package Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class StackCodeNotes {
    public static void main(String[] args) {
        // Declaration
        // Implemented using Vector to have First In an Last Out type of implementation
        // Default Capacity is 10 (just like Vector and Array List)
        // Since it extends Vector and is based on Vector hence has implements RandomAccess marker interface
        Stack<Integer> stack = new Stack<>();

        // Declaration using other collections is not available in stack.

        // Getting Size of a Stack and Capacity-
        System.out.println("Size of Stack - " + stack.size());
        System.out.println("Default Capacity of Stack - " + stack.capacity());

        // Pushing Elements to a Stack
        // Note - Add method also works since this extends Vector class
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack - " + stack);

        // Have a Peak at the Top Element of the Stack
        System.out.println("Top Element - " + stack.peek());

        // Getting element at a particular Index in a Stack
        System.out.println("Element at index 0 - " + stack.get(0)); // 0 is the bottom element in the stack
        System.out.println("Element at index 4 - " + stack.get(4)); // 4 is the top element in the stack

        // Popping Top Element in a Stack
        System.out.println("Pop top element " + stack.pop()); // Return top element
        System.out.println("Stack - " + stack);

        // Setting element in a particular index
        System.out.println("Setting Element at index 2");
        stack.set(2, 100);
        System.out.println("Stack - " + stack);

        // Searching an Element in Stack
        System.out.println("Search Stack for 100 - " + stack.search(100)); // Returns 1 based index from top, -1 if not exists
        System.out.println("Search Stack for 2 - " + stack.search(2)); // Returns 1 based index from top, -1 if not exists
        System.out.println("Search Stack for 1 - " + stack.search(1)); // Returns 1 based index from top, -1 if not exists
        System.out.println("Stack Contains 2 - " + stack.contains(2));

        // Clear all elements in a Stack
        stack.clear();
        System.out.println("Stack - " + stack);

        // Iterating Over a stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Iterating using a For Loop");
        for(int i=0; i<stack.size(); i++) {
            System.out.println("Element in stack at index " + i + " - " + stack.get(i));
        }

        System.out.println("Iterating using an Enhanced For Loop");
        for(Integer elem: stack) {
            System.out.println("Element in Stack - " + elem);
        }

        System.out.println("Iterating using Iterator");
        Iterator<Integer> it = stack.iterator();
        while(it.hasNext()) {
            System.out.println("Element in Stack - " + it.next());
        }

        System.out.println("Iterating using ListIterator");
        ListIterator<Integer> listIterator = stack.listIterator();
        while(listIterator.hasNext()) {
            System.out.println("Element in Stack - " + listIterator.next());
        }

        // After traversing once, the Iterator is now at the end hence we can do an additional thing
        // in listIterator which we can't do in normal Iterator (Traversing Backwards)
        // listIterator is bidirectional
        System.out.println("Iterating backwards");
        while(listIterator.hasPrevious()) {
            System.out.println("Element in Stack in Reverse - " + listIterator.previous());
        }

        // using Lambda function using removeIf
        stack.removeIf(n -> (n % 2 == 0));

        System.out.println("Stack - " + stack); // Removed all event integers
    }
}
