//Similar to Dynamic Method Dispatch in Inheritance

class CellPhone {
    void Call() {
        System.out.println("Calling.....");
    }
}

interface Camera {
    void RecordVideo();
}

interface Wifi {
    void Connect();
}

interface MediaPlayer {
    void PlayMusic();
}

class Apple_iPhone extends CellPhone implements Camera, Wifi, MediaPlayer {
    @Override
    public void RecordVideo() {
        System.out.println("Recording Video.....");
    }

    @Override
    public void Connect() {
        System.out.println("Connecting to Wifi.....");
    }

    @Override
    public void PlayMusic() {
        System.out.println("Playing Music.....");
    }
}

public class T59_PolymorphismInInterfaces {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------
        Camera DeviceOne = new Apple_iPhone();
        //Providing "Apple_iPhone" saying it as "Camera".
        //Here only "Camera" method can be used from the "Apple_iPhone".
        //e.g.:- This is "Apple_iPhone" but use it as "Camera".

        DeviceOne.RecordVideo();                  //Allowed
//        DeviceOne.Connect();                    //Not Allowed
//        DeviceOne.PlayMusic();                  //Not Allowed

        //--------------------------------------------------------------------------------------------------------------
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------
        Apple_iPhone DeviceTwo = new Apple_iPhone();
        //Providing "Apple_iPhone" saying it as "Apple_iPhone".
        //Here all method can be used from the "Apple_iPhone".
        //e.g.:- This is "Apple_iPhone" use it as "Apple_iPhone".

        DeviceTwo.RecordVideo();                  //Allowed
        DeviceTwo.Connect();                      //Allowed
        DeviceTwo.PlayMusic();                    //Allowed

//----------------------------------------------------------------------------------------------------------------------
    }
}
//Important  //Watch Video.....
