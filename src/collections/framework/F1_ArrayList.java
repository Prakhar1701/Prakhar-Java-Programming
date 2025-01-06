package collections.framework;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

public class F1_ArrayList {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Initial Capacity = 10 (Default)

        // ArrayList<Integer> arrayList = new ArrayList<>(100); // Initial Capacity = 100 (Given)

        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(15);

        System.out.println(arrayList.get(1));

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (int i : arrayList) {
            System.out.println(i);
        }

        System.out.println(arrayList.contains(10));

        arrayList.remove(2);

        arrayList.add(0, 1); // OR arrayList.addFirst(1);

        arrayList.set(0, 2);

        System.out.println(arrayList);


        // Access the private 'elementData' field of the ArrayList class using reflection
        Field elementDataField = ArrayList.class.getDeclaredField("elementData");
        elementDataField.setAccessible(true);

        // Retrieve the internal array of the ArrayList
        Object[] internalArray = (Object[]) elementDataField.get(arrayList);
        System.out.println("ArrayList initial capacity: " + internalArray.length);

        // Add more elements to the ArrayList
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(38);
        arrayList.add(35);
        arrayList.add(40);
        arrayList.add(35);
        arrayList.add(50);
        arrayList.add(33);

        // Retrieve the internal array again to check capacity after modification
        internalArray = (Object[]) elementDataField.get(arrayList);
        System.out.println("ArrayList updated capacity: " + internalArray.length);


        arrayList.remove(Integer.valueOf(20)); // Remove integer element -> 20

        System.out.println(arrayList);

        // Converting to Integer Array
        Integer[] array = arrayList.toArray(new Integer[0]);

        Collections.sort(arrayList);

        System.out.println(arrayList);

        arrayList.add(44);

        arrayList.sort(null);

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);


        arrayList.trimToSize();

        // Retrieve the internal array again to check capacity after modification
        internalArray = (Object[]) elementDataField.get(arrayList);
        System.out.println("ArrayList updated capacity: " + internalArray.length);

    }
}
