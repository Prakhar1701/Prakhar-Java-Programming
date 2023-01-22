class MyEmployee {
    private int id;
    private String name;

    //Getters and Setters:
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }
}

public class T40_GettersAndSetters_Chapter9 {
    public static void main(String[] args) {
        MyEmployee prakhar = new MyEmployee();

        //--------------------------------------------------------------------------------------------------------------
        //Throws an error due to private access modifier:
        //prakhar.id=45;
        //prakhar.name="Prakhar Agrawal";
        //--------------------------------------------------------------------------------------------------------------

        prakhar.setName("Prakhar Agrawal");
        System.out.println(prakhar.getName());

        prakhar.setId(45);
        System.out.println(prakhar.getId());
    }
}


