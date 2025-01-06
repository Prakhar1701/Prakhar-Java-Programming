package collections.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F2_List {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1.getClass().getName());

        List<String> list2a = Arrays.asList("Monday", "Tuesday"); // Fixed size
        System.out.println(list2a.getClass().getName());
        // Adding and Removing element is not possible here
        list2a.set(1, "Wednesday"); // Replace element
        System.out.println(list2a.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2b = Arrays.asList(array);

        System.out.println(list2b.getClass().getName());

        List<Integer> list3 = List.of(1, 2, 3, 4);
        // Adding, Removing and Replacing element is not possible here
        // arrayList4.set(1, 33); java.lang.UnsupportedOperationException

        list1.addAll(list3);
        System.out.println(list1);
    }
}