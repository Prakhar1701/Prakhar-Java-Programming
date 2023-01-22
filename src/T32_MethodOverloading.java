package com.company;

public class T32_MethodOverloading {
    //Two or more methods can have same name but different parameters.Such methods are called Overloaded Methods.
    //Method Overloading cannot be performed by changing the return type of methods.
    static void foo() {
        System.out.println("Prakhar Respect+");
    }

    static void foo(int a) {
        System.out.println("Prakhar Respect+" + a);
    }

    static void foo(int a, int b) {
        System.out.println("Prakhar Respect+" + (a + b));
        System.out.println("Prakhar Respect+" + a + b);
    }

    public static void main(String[] args) {
        foo();
        foo(10);
        foo(50, 50);
    }
}
