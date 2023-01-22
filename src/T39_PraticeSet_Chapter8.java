import java.util.Scanner;

class Employee {

    int Salary;
    String name;

    int getSalary() {
        return Salary;
    }

    String getName() {
        return name;
    }

    void setName(String currentName) {
        name = currentName;
    }
}

public class T39_PraticeSet_Chapter8 {
    public static void main(String[] args) {
        Employee Prakhar = new Employee();
        Prakhar.name = "Prakhar Agrawal";

        Prakhar.Salary = 500000;
//        System.out.println("~~~"+Prakhar.name);
        Scanner scn = new Scanner(System.in);
        Prakhar.setName( scn.nextLine());
//        System.out.println("~~~"+Prakhar.name);


    }
}

//to be completed and doubt to be resolved..............................