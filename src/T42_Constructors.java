class MyMainEmployee {
    private int id;
    private String name;

//----------------------------------------------------------------------------------------------------------------------
    //Constructor:

    public MyMainEmployee() {
        id = 17;
        name = "Prakhar Agrawal";
    }

    //Constructor-Overloading:

    public MyMainEmployee(int myId,String myName) {
        id = myId;
        name = myName;
    }
//----------------------------------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class T42_Constructors {
    public static void main(String[] args) {

        MyMainEmployee prakhar = new MyMainEmployee();
        System.out.println(prakhar.getName());
        System.out.println(prakhar.getId());


        MyMainEmployee shikhar = new MyMainEmployee(50,"Shikhar Agrawal");
        System.out.println(shikhar.getName());
        System.out.println(shikhar.getId());

        /*QuickQuiz to do................*/
    }
}


