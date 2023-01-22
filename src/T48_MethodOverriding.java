class ClassOne {
    public void MethodOne() {
        System.out.println("I am \"MethodOne\" of \"ClassOne\".");
    }

    public void MethodTwo() {
        System.out.println("I am \"MethodTwo\" of \"ClassOne\".");
    }
}

class ClassTwo extends ClassOne {
    @Override  //Notation for  overriding a method, not necessary but recommended.
    public void MethodOne() {
        System.out.println("I am \"MethodOne\" of \"ClassTwo\".");
    }
}

public class T48_MethodOverriding {
    public static void main(String[] args) {

        ClassOne c1 = new ClassOne();

        c1.MethodOne();
        c1.MethodTwo();

        System.out.println();

        ClassTwo c2 = new ClassTwo();

        c2.MethodOne();
        c2.MethodTwo();

    }
}
