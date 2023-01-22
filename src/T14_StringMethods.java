package com.company;


public class T14_StringMethods {
    public static void main(String[] args) {

        String name = "    Prakhar Agrawal    ";
        System.out.println("{ , , , ,P,r,a,k,h,a,r, ,A,g,r,a,w,a,l, , , , }");
        System.out.println("{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22}");


        System.out.printf("The string is \"%s\"\n", name);

        int length = name.length();
        System.out.printf("Number of character in the string including wide spaces: %d\n", length);

        String nameToLowerCase = name.toLowerCase();
        System.out.println(nameToLowerCase);

        String nameToUpperCase = name.toUpperCase();
        System.out.println(nameToUpperCase);

        String nameTrim = name.trim();
        System.out.println(nameTrim);

        System.out.println(name.substring(3)); //The character at the given index is included.

        System.out.println(name.substring(4, 11));  //name.substring(int start,int end);
        /*Here the character at the given index "start" is included
        and the character the given index "end" is not included.*/

        System.out.println(name.replace('r', 's'));

        System.out.println(name.replace("Pra", "Shi"));

        System.out.println(name.replace("r", "XxX"));

        boolean b1 = name.startsWith("Prakhar");
        System.out.println("Is the string starts with \"Prakhar\" : " + b1);

        boolean b2 = name.endsWith("Agrawal    ");
        System.out.println("Is the string ends with \"Agrawal    \" : " + b2);

        System.out.println("Character at index \'4\' : " + name.charAt(4));

        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf('s')); //Returns -1 as character 's' is not present in the string.
        System.out.println(name.indexOf("Pr"));
        System.out.println(name.indexOf('r', 6));

        System.out.println(name.lastIndexOf('P'));
        //Starts searching the character 'r' from last of the string, e.g.:- Search in reverse order.
        System.out.println(name.lastIndexOf('P', 3)); //<-0123

        System.out.println(name.equals("Harry")); //Case Sensitive
        System.out.println(name.equalsIgnoreCase("    prakhar agrawal    "));

        /*
        Escape Sequence Character : '\'
        e.g.;-
        \n , \t , \b , \r , \f , \' , \\ , ............etc.
         */
    }
}

