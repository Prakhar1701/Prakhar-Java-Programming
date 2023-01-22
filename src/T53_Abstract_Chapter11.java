//----------------------------------------------------------------------------------------------------------------------
/*
//----------------------------------------------------------------------------------------------------------------------
//1.Abstract method is a method declared without an implementation.

//2.A abstract class may or may not contain any abstract method.

//3.If a class includes abstract methods, then the class itself must be declared abstract.

//4.When an abstract class is subclassed, the subclass usually provides implementation for all methods in parent class.
//  If it doesn't, it must be declared abstract.
//----------------------------------------------------------------------------------------------------------------------
 */
//----------------------------------------------------------------------------------------------------------------------
abstract class Parent {
    public void MethodOne() {
        System.out.println("I am \"MethodOne\" in \"Parent\" class.");
    }

    abstract public void MethodTwo();

    abstract public void MethodThree();

}
//----------------------------------------------------------------------------------------------------------------------
class ChildOne extends Parent {
//    public void MethodOne() {
//        System.out.println("I am \"MethodOne\" in \"ChildOne\" class.");
//    }

    public void MethodTwo() {
        System.out.println("I am \"MethodTwo\" in \"ChildOne\" class.");
    }

    public void MethodThree() {
        System.out.println("I am \"MethodThree\" in \"ChildOne\" class.");
    }
}
//----------------------------------------------------------------------------------------------------------------------
abstract class ChildTwo extends Parent {
//    public void MethodOne() {
//        System.out.println("I am \"MethodOne\" in \"ChildTwo\" class.");
//    }

    public void MethodTwo() {
        System.out.println("I am \"MethodTwo\" in \"ChildTwo\" class.");
    }

}
//----------------------------------------------------------------------------------------------------------------------
class ChildThree extends ChildTwo {
//    public void MethodOne() {
//        System.out.println("I am \"MethodOne\" in \"ChildThree\" class.");
//    }
//
//    public void MethodTwo() {
//        System.out.println("I am \"MethodTwo\" in \"ChildThree\" class.");
//    }

    public void MethodThree() {
        System.out.println("I am \"MethodThree\" in \"ChildThree\" class.");
    }
}
//----------------------------------------------------------------------------------------------------------------------
public class T53_Abstract_Chapter11 {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------
        // Not Allowed:

//        Parent object1 = new Parent();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println();
//----------------------------------------------------------------------------------------------------------------------
        // Allowed:

        Parent object2 = new Parent() {
            @Override
            public void MethodTwo() {
                System.out.println("I am \"MethodTwo\" in \"Parent\" class.");
            }

            @Override
            public void MethodThree() {
                System.out.println("I am \"MethodThree\" in \"Parent\" class.");
            }
        };

        object2.MethodOne();
        object2.MethodTwo();
        object2.MethodThree();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println();
//----------------------------------------------------------------------------------------------------------------------
        //Allowed:

        ChildOne object3 = new ChildOne();

        object3.MethodOne();
        object3.MethodTwo();
        object3.MethodThree();
//----------------------------------------------------------------------------------------------------------------------
        // Not Allowed:

//        ChildTwo object4 = new ChildTwo();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println();
//----------------------------------------------------------------------------------------------------------------------
        // Allowed:

        ChildTwo object4 = new ChildTwo() {
            @Override
            public void MethodThree() {
                System.out.println("I am \"MethodThree\" in \"ChildTwo\" class.");
            }
        };

        object4.MethodOne();
        object4.MethodTwo();
        object4.MethodThree();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println();
//----------------------------------------------------------------------------------------------------------------------
        // Allowed:

        ChildThree object5 = new ChildThree();

        object5.MethodOne();
        object5.MethodTwo();
        object5.MethodThree();
//----------------------------------------------------------------------------------------------------------------------
    }
}

