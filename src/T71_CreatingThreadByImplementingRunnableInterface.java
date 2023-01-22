class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread3 Is Running");
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread4 Is Running");
        }
    }
}

public class T71_CreatingThreadByImplementingRunnableInterface {
    public static void main(String[] args) {

        MyThread3 BulletOne = new MyThread3();
        Thread GunOne = new Thread(BulletOne);

        MyThread4 BulletTwo = new MyThread4();
        Thread GunTwo = new Thread(BulletTwo);

        GunOne.start();
        GunTwo.start();
    }
}
