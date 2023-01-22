package com.company;

public class T33_VariableArguments_VarArgs {
    static int sum1(int... arr) {              //No argument is necessary
        int result = 0;
        for (int x : arr) {                    //for-each loop
            result += x;
        }
        return result;
    }

    static int sum2(int a,int... arr) {       //Atleast one argument is necessary
        int result = a;
        for (int x : arr) {                   //for-each loop
            result += x;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of nothing is " + sum1());
        System.out.println("The sum of 1,2 & 3 is " + sum1(1, 2, 3));
        System.out.println("The sum of 1,2 & 3 is " + sum2(1, 2, 3));

    }
}