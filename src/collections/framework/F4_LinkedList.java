package collections.framework;

import java.util.Arrays;
import java.util.LinkedList;

public class F4_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>(); // Double LinkedList internally

        animals.add("Dog");
        animals.add("Cow");
        animals.add("Horse");
        animals.add("Elephant");

        System.out.println(animals);

        animals.addFirst("Cat"); // O(1)

        animals.addLast("Lion"); // O(1)

        System.out.println(animals);

        System.out.println(animals.get(4)); // O(n)

        System.out.println(animals.getFirst());

        System.out.println(animals.getLast());

        animals.remove(2);

        System.out.println(animals);

        animals.removeIf(s -> s.length() == 5);

        System.out.println(animals);

        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));

        animals.removeAll(animalsToRemove);

        System.out.println(animals);
    }
}
