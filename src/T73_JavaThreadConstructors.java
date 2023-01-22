class MyThread5 extends Thread {
    public MyThread5(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        System.out.println("I am Thread5");
    }
}

class MyThread6 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Thread6");
    }
}

public class T73_JavaThreadConstructors {
    public static void main(String[] args) {

        MyThread5 t5 = new MyThread5("prakhar");
        t5.start();
        System.out.println("Name of MyThread5 is : " + t5.getName());
        System.out.println("ID of MyThread5 is : " + t5.getId());


        MyThread6 t = new MyThread6();
        Thread t6 = new Thread(t, "shikhar");
        t6.start();
        System.out.println("Name of MyThread6 is : " + t6.getName());
        System.out.println("ID of MyThread6 is : " + t6.getId());

        //There are many more Thread Constructors to learn!
    }
}
