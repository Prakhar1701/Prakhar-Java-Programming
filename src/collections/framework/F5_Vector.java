package collections.framework;

import java.util.Vector;

public class F5_Vector {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        System.out.println("Vector elements: " + vector);

        vector.insertElementAt("Inserted Element", 1);
        System.out.println("After insertion: " + vector);

        vector.remove("Element 2");
        System.out.println("After removal: " + vector);

        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        System.out.println("Index of 'Element 3': " + vector.indexOf("Element 3"));

        System.out.println("Is vector empty? " + vector.isEmpty());

        vector.setElementAt("Updated Element 1", 0);
        System.out.println("After updating first element: " + vector);

        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());

        vector.clear();
        System.out.println("After clearing: " + vector);

    }
    /*
     * The `Vector` class in Java:
     *
     * 1. Legacy Class:
     *    - Introduced in JDK 1.0, predating the Collections Framework.
     *    - Retrofitted to be part of the Collections Framework in JDK 1.2 by implementing the List interface.
     *
     * 2. Synchronized/thread-safe:
     *    - All its methods are synchronized, ensuring thread safety at the cost of performance in single-threaded environments.
     *
     * 3. Dynamic Array Implementation:
     *    - Uses a dynamic array to store elements, automatically expanding its capacity when needed.
     *
     * 4. Growth Policy:
     *    - By default, its capacity doubles when the array is full, unlike ArrayList which grows by 50% of its current size.
     *
     * 5. Iterators and Enumeration:
     *    - Supports legacy Enumeration along with modern Iterator and ListIterator.
     *
     * 6. Null values:
     *    - Allows `null` values to be added to the Vector.
     *
     * 7. Comparison with ArrayList:
     *    - Vector is synchronized, making it slower in single-threaded environments compared to ArrayList.
     *    - ArrayList is generally preferred in modern applications unless thread safety is explicitly required.
     *
     * 8. Usage:
     *    - Useful in situations requiring synchronized access to elements.
     *    - For non-synchronized environments, ArrayList or CopyOnWriteArrayList is recommended.
     */
}
