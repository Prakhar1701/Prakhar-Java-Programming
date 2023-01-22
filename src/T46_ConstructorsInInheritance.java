class Base1 {
    Base1() {
        System.out.println("I am a Base1 class constructor");
    }

    Base1(int x) {
        System.out.println("I am a overloaded \"Base1\" class constructor with value of 'x' as : " + x);

    }
}

/*
// "super" keyword :
e.g.:-
super(a,b); -->Calls the constructor from the parent class which takes 2 variables.\
 */

class Derived1 extends Base1 {
    Derived1() {
        super(0);
        System.out.println("I am a \"Derived1\" class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am a overloaded \"Derived1\" class constructor with value of 'y' as : " + y);
    }
}

class ChildOfDerived1 extends Derived1 {
    ChildOfDerived1() {
        System.out.println("I am a \"ChildOfDerived1\" constructor");
    }

    ChildOfDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a overloaded \"ChildOfDerived1\" constructor with value of 'z' as : " + z);
    }

}

public class T46_ConstructorsInInheritance {
    public static void main(String[] args) {

        Base1 b = new Base1();

        System.out.println();

        Derived1 d1 = new Derived1();

        System.out.println();

        Derived1 d2 = new Derived1(14, 9);

        System.out.println();

        ChildOfDerived1 cd1 = new ChildOfDerived1();

        System.out.println();

        ChildOfDerived1 cd2 = new ChildOfDerived1(12,13,15);

    }
}

