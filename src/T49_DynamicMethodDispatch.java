class Phone {                               // Super Class

    void TurnOn() {
        System.out.println("Turning on Phone.....");
    }

    void ShowTime() {
        System.out.println("The time is 10:10");
    }
}

class SmartPhone extends Phone {            // Sub Class

    @Override
    void TurnOn() {
        System.out.println("Turning on Smartphone.....");
    }

    void ConnectToWifi() {
        System.out.println("Connecting to Wifi.....");
    }
}

public class T49_DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone object1 = new SmartPhone();
        //Every Smartphone is a Phone.

        object1.TurnOn();
        object1.ShowTime();
//      object.ConnectToWifi();                          //Not Allowed
        //Until it is know that the Phone "object1" is a Smartphone, you can't connect to Wifi.

//      SmartPhone object2 = new Phone();                //Not Allowed
        //Every Phone is not a Smartphone.
    }
}
