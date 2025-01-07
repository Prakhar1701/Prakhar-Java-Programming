package collections.framework;

import java.util.ArrayList;
import java.util.Comparator;

public class F3_Comparator {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(22);
        arrayList.add(15);
        arrayList.add(30);
        arrayList.add(28);

        System.out.println(arrayList);

        // Sort in descending order using comparator
        arrayList.sort(new IntegerComparator());

        System.out.println(arrayList);

        // Sort in ascending order using lambda expression
        arrayList.sort((o1, o2) -> o1 - o2);

        System.out.println(arrayList);


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Blueberry");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        System.out.println(fruits);

        fruits.sort(null); // Default sort in alphabetic order

        System.out.println(fruits);

        fruits.sort(new StringComparator());

        System.out.println(fruits);

        fruits.sort((s1, s2) -> s2.length() - s1.length());

        System.out.println(fruits);


        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Prakhar", 23));
        students.add(new Student("Ashmit", 21));
        students.add(new Student("Shivam", 22));
        students.add(new Student("Karan", 23));
        students.add(new Student("Aditiya", 21));

        System.out.println("Students:\n" + students);

        // students.sort(null);
        // - Error as Student is not an inbuilt class
        // - Student class do not implement interface Comparable which inbuilt classes do
        // - compareTo() in Comparable defines the default or natural sorting for inbuilt classes

        students.sort((s1, s2) -> s1.getAge() - s2.getAge());

        System.out.println("Students sorted by age in ascending order:\n" + students);

        Comparator<Student> comparator = Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName);

        students.sort(comparator);

        System.out.println("Students sorted by age in descending order then sorted by name in alphabetical order:\n" + students);

    }
}


class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1); // i2 - i1
    }
}


class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}


class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "name= \"" + name + '\"' +
                        ", age= " + age;
    }
}