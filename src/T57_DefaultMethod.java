/*
// 1.An Interface have static and default methods.

// 2.Default methods enable us to add new functionality to the existing interfaces.

// 3.This feature was introduced in Java-8 to ensure backward compatibility while updating an interface.

//4.Classes implementing the interface need not implement the default methods.

//5.Interfaces can also include private methods for default methods to use.
 */
interface InterfaceWithDefaultMethod {
    void MethodOne();

    private void MethodTwo() {
        System.out.println("I am MethodTwo of InterfaceWithDefaultMethod.");
    }

    default void MethodThree() {
        //Default Method can be Override if needed in implementation.
        MethodOne();
        MethodTwo();
        System.out.println("I am MethodThree of InterfaceWithDefaultMethod.");
    }

}

class ClassImplementingInterfaceWithDefaultMethod implements InterfaceWithDefaultMethod {
    @Override
    public void MethodOne() {
        System.out.println("I am MethodOne of ClassImplementingInterfaceWithDefaultMethod.");
    }

}


public class T57_DefaultMethod {
    public static void main(String[] args) {
        ClassImplementingInterfaceWithDefaultMethod object = new ClassImplementingInterfaceWithDefaultMethod();
//      object.MethodOne();       //Allowed
//      object.MethodTwo();       //Not Allowed
        object.MethodThree();
    }
}
