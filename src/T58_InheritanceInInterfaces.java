//Interfaces can extend another interfaces.

interface SampleInterface {
    void Method1();
}

interface ChildSampleInterface extends SampleInterface {
    void Method2();
}

public class T58_InheritanceInInterfaces {
    public static void main(String[] args) {
        ChildSampleInterface object = new ChildSampleInterface() {
            @Override
            public void Method2() {
                System.out.println("I am Method2");
            }

            @Override
            public void Method1() {
                System.out.println("I am Method1");
            }
        };

        object.Method1();
        object.Method2();
    }
}
