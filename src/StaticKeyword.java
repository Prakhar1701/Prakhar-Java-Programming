package com.company;

class Emp {

    int eid;
    int salary;
    static String ceo;  //Not object specific ,e.g. Same for all the object.
    // Goes inside Class loader Memory and not in Heap Memory.


    public Emp() {       //Constructor
        //Constructor will be called every time when an object is being created.
        eid = 1;
        salary = 3000;

//        ceo = "Larry"; // Not every object is need to specify the value of the Static Variable "ceo".
        System.out.println("In Constructor");
    }


    static {             //Static Block
        //Executes only ones when the Class is loaded.

        ceo = "Larry";

//        eid = 1;   ////We can not access a Non-static variable from  a Static Block.

        System.out.println("In Static");
    }

    static {             //Static Block
        //Executes only ones when the Class is loaded.
        ceo = "Shikhar";
        System.out.println("In Static");
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class StaticKeyword {
    int i = 0;

    public static void main(String[] args) {

//        i = 9; //We can not access a Non-static variable from  a Static Method.

        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;
//        navin.ceo = "Mahesh";
        Emp rahul = new Emp();
        rahul.eid = 9;
        rahul.salary = 5000;
//        rahul.ceo = "Mahesh";
// //     Emp.ceo = "Nikita";   //Object name can also be used to assign value to a Static Variable.
        Emp prakhar = new Emp();


        navin.show();
        rahul.show();
        prakhar.show();
    }
}
/*

//First step before creating an object is to load the class.
//Object is created inside the heap memory.
//Class is loaded in a special memory in the JVM, it is also called Class Loader Memory.
//We don't need an object to access a static variable.
//If we make a Method as Static we don't make an object to call that Method, e.g. "main" Method.
//Static Block will always be executed first before the Constructor irrespective of sequence in which they are placed
  because class loads first before object creation.
//If there are multiple Static Blocks then the sequence will be followed from top to bottom of code.
//Static methods cannot be overridden because they are not dispatched on the object instance at runtime, but it can be
  re-declared.
*/

