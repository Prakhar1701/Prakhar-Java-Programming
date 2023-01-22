class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {      //Inheritance in Java is declared using "extends" keyword.
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class T45_InheritanceInJava_Chapter10 {
    public static void main(String[] args) {

        // Creating an Object of Base class:
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an Object of Derived class:
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
    /*
    QuickQuiz to do.............................
     */
}

