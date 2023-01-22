class Employees{
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class T38_CustomClass {
    public static void main(String[] args) {
        //Instantiating a new Employee Object
        Employees prakhar =new Employees ();
        Employees harry =new Employees ();


        //Setting Attributes (Properties):
        //For prakhar:
        prakhar.id=17;
        prakhar.salary=500000;
        prakhar.name="Prakhar Agrawal";
        //For harry:
        harry.id=12;
        harry.salary=1000000;
        harry.name="Code With Harry";


        // Printing the Attributes:
        System.out.println(prakhar.id);
        System.out.println(prakhar.name);
        System.out.println(harry.id);
        System.out.println(harry.name);
        prakhar.printDetails();
        harry.printDetails();
        System.out.println("Salary of Prakhar Agrawal is "+prakhar.getSalary());
        System.out.println("Salary of Code With Harry is "+harry.getSalary());

    }
}
