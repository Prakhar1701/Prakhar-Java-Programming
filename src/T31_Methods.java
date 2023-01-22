package com.company;

public class T31_Methods {
    static int logic(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int a = 7, b = 10, c;
        c = logic(a, b);
        // If "static" keyword is not present before the method "logic":
        //Method invocation using object creation.
        // T31_Methods obj = new T31_Methods();
        // c = obj.logic(a, b);

        System.out.println(c);
    }
}
