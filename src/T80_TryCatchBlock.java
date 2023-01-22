import java.util.Scanner;

public class T80_TryCatchBlock {
    public static void main(String[] args) {

        int a = 500, b, c;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value of 'b' :");
        b = scn.nextInt();
        try {
            c = a / b;
            System.out.println("c : " + c);
        } catch (Exception reason) {
            System.out.println("We failed to divide.\nReason :");
            System.out.println(reason);
        }

        System.out.println("End of Program...");
    }
}