package com.company;
//----------------------------------------------------------------------------------------------------------------
//Importing Scanner class:
import java.util.Scanner;
//----------------------------------------------------------------------------------------------------------------

public class T5_TakingInput {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------
        //Creating a scanner class object :
        Scanner sc = new Scanner(System.in);
        //--------------------------------------------------------------------------------------------------------
        System.out.println("Enter value of integer variable 'a':");
        int a =sc.nextInt(); //Takes a integer value as an input and store it in integer variable 'a'.
        System.out.println("a= "+a);
        //--------------------------------------------------------------------------------------------------------
        System.out.println("Enter a value to check weather it is an integer or not :");
        boolean a1=sc.hasNextInt(); //Takes a value as an input and checks weather it is an integer or not and store the result in boolean variable "a1".
        System.out.println("The entered value is an integer : "+a1);
        //--------------------------------------------------------------------------------------------------------
//        String stry = sc.next();
//        String str = sc.nextLine();

    }
}
