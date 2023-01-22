//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
/*

// 1.Properties can be created in interfaces.

// 2.Literals of properties in interface are final and can not be updated.

// 3.A class or abstract class can be created only extending single class or
//   single abstract class and implementing multiple interfaces.

// 4.Interfaces methods are public by default.

 */
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
interface Experiment1 {

    int property = 5;

}

class Experiment2 {
    public void MethodExperiment2() {
        System.out.println("I am a method \"MethodExperiment2\" of class \"Experiment2\".");
    }
}

class Experiment3 extends Experiment2 implements Experiment1 {
    int property = 17;    //OverWriting Property  //Not Necessary

    public void MethodExperiment3() {
        System.out.println("I am a method \"MethodExperiment3\" of class \"Experiment3\".");
    }
}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
interface Bike {
    void ApplyBreakBike();

    void SpeedUpBike();
}

//----------------------------------------------------------------------------------------------------------------------
interface Car {
    void ApplyBreakCar();

    void SpeedUpCar();
}

//----------------------------------------------------------------------------------------------------------------------
class BMW implements Bike, Car {
    @Override
    public void ApplyBreakBike() {
        System.out.println("Applying Bike Breaks.....");
    }

    @Override
    public void SpeedUpBike() {
        System.out.println("Speeding Up Bike.....");
    }

    @Override
    public void ApplyBreakCar() {
        System.out.println("Applying Car Breaks.....");
    }

    @Override
    public void SpeedUpCar() {
        System.out.println("Speeding Up Car.....");
    }
}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
public class T54_T55_Interfaces_InterfacesVsAbstract {
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        BMW AutoMobile1 = new BMW();

        AutoMobile1.ApplyBreakBike();
        AutoMobile1.SpeedUpBike();

        System.out.println();

        AutoMobile1.ApplyBreakCar();
        AutoMobile1.SpeedUpCar();

        //--------------------------------------------------------------------------------------------------------------
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------
        Bike AutoMobile2 = new Bike() {
            @Override
            public void ApplyBreakBike() {

            }

            @Override
            public void SpeedUpBike() {

            }
        };

        AutoMobile2.ApplyBreakBike();
        AutoMobile2.SpeedUpBike();
        //--------------------------------------------------------------------------------------------------------------
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------

        Experiment1 Exp1 = new Experiment1() {
        };
        System.out.println("property : " + Exp1.property);
//        Exp1.property = 10; //Not Allowed
        //Literals of properties in interface are final and can not be updated.
        //--------------------------------------------------------------------------------------------------------------
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------

        Experiment3 Exp2 = new Experiment3();

        System.out.println("property : " + Exp2.property);
        Exp2.MethodExperiment2();
        Exp2.MethodExperiment3();
        //--------------------------------------------------------------------------------------------------------------
    }
}
